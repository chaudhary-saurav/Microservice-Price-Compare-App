package com.api.warehouse.controller;

import com.api.warehouse.constant.WarehouseConstant;
import com.api.warehouse.dto.WarehouseProductTO;
import com.api.warehouse.request.WarehouseRequest;
import com.api.warehouse.response.WarehouseResponse;
import com.api.warehouse.service.WarehouseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarehouseController {
    private final static Logger logger = LoggerFactory.getLogger(WarehouseController.class);
    @Autowired
   private WarehouseServiceImpl warehouseservice;

    @Value("${server.port}")
    int port;

    @Value("${spring.application.name}")
    String appname;

    @PostMapping("/createproduct")
    public WarehouseResponse createproduct(@RequestBody List<WarehouseRequest> productlist) {
        logger.info("***START---createproduct() productlist{}" + productlist);
        WarehouseResponse response = new WarehouseResponse();
        try {
            String sucess = warehouseservice.createmyproduct(productlist);
            response.setMessage(sucess);
            response.setStatuscode(WarehouseConstant.SUCESS_CODE);
            response.setPort(port);
            response.setAppname(appname);

        } catch (Exception e) {
            response.setMessage(WarehouseConstant.INSERTFAIL_MSG);
            response.setStatuscode(WarehouseConstant.NOCONTENT_CODE);
            response.setPort(port);
            response.setAppname(appname);
        }
        logger.info("***END---createproduct()");
        return response;
    }

    @GetMapping("/getallproduct")
    public WarehouseResponse getallproduct() {
        WarehouseResponse response = new WarehouseResponse();
        logger.info("***START---getallproduct()");
        try {
            List<WarehouseProductTO> allproductdetals = warehouseservice.getmyproduct();
            response.setProductDetails(allproductdetals);
            response.setStatuscode(WarehouseConstant.SUCESS_CODE);
            response.setMessage(WarehouseConstant.SUCESS_MSG);
            response.setPort(port);
            response.setAppname(appname);
        } catch (Exception e) {
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.NOCONTENT_CODE);
            response.setMessage(WarehouseConstant.NOCONTENT_MSG);
            response.setPort(port);
            response.setAppname(appname);
        }
        logger.info("***END---getallproduct()-RESPONSE {} " + response);
        return response;
    }

    @GetMapping("/getproductbyid/{id}")
    public WarehouseResponse getproductbyid(@PathVariable int id) {
        logger.info("***START---getproductbyid() id{} " + id);
        WarehouseResponse response = new WarehouseResponse();
        try {
            List<WarehouseProductTO> producrList = warehouseservice.getbyidmyproduct(id);
            response.setProductDetails(producrList);
            response.setStatuscode(WarehouseConstant.SUCESS_CODE);
            response.setMessage(WarehouseConstant.SUCESS_MSG);
            response.setPort(port);
            response.setAppname(appname);
        } catch (Exception e) {
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.NOCONTENT_CODE);
            response.setMessage(WarehouseConstant.NOCONTENT_MSG);
            response.setPort(port);
            response.setAppname(appname);
        }
        logger.info("***getproductbyid() RESPONSE{} ***" + response);
        return response;
    }

    @PutMapping("/updateproduct/{id}")
    public WarehouseResponse updateproduct(@PathVariable int id, WarehouseRequest product) {
        logger.info("***START---updateproduct() id{} " + id + "Product{}" + product);
        WarehouseResponse response = new WarehouseResponse();
        try {
            product.setId(id);
            String statusMsg = warehouseservice.updatemyproduct(product);
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.SUCESS_CODE);
            response.setMessage(statusMsg);
            response.setPort(port);
            response.setAppname(appname);
        } catch (Exception e) {
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.NOCONTENT_CODE);
            response.setMessage(WarehouseConstant.NOCONTENT_MSG);
            response.setPort(port);
            response.setAppname(appname);
        }
        logger.info("***END---updateproduct()*** RESPONSE" + response);
        return response;
    }

    @DeleteMapping("/deleteproduct/{id}")
    public WarehouseResponse deleteproduct(@PathVariable int id) {
        logger.info("***START---updateproduct() id{} " + id);
        WarehouseResponse response = new WarehouseResponse();
        try {
            warehouseservice.deletemyproduct(id);
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.SUCESS_CODE);
            response.setMessage(WarehouseConstant.SUCESS_MSG);
            response.setPort(port);
            response.setAppname(appname);
        } catch (Exception e) {
            response.setProductDetails(null);
            response.setStatuscode(WarehouseConstant.NOCONTENT_CODE);
            response.setMessage(WarehouseConstant.NOCONTENT_MSG);
            response.setPort(port);
            response.setAppname(appname);
        }
        logger.info("***END---deleteproduct()*** RESPONSE{} " + response);
        return response;
    }
}
