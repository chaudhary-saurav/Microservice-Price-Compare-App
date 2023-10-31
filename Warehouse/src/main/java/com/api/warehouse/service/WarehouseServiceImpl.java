package com.api.warehouse.service;

import com.api.warehouse.dao.WarehouseDAO;
import com.api.warehouse.dto.WarehouseProductTO;
import com.api.warehouse.model.WarehouseProduct;
import com.api.warehouse.request.WarehouseRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    private final static Logger logger = LoggerFactory.getLogger(WarehouseServiceImpl.class);

    @Autowired
    private WarehouseDAO daoimpl;

    @Override
    public String createmyproduct(List<WarehouseRequest> product) {
        logger.info("***START--createmyproduct()-- product{}" + product);
        String statusMsg = "";
        List<WarehouseRequest> myproduct = product;
        List<WarehouseProduct> toproduct = new ArrayList<WarehouseProduct>();
        for (WarehouseRequest warehouseRequest : myproduct) {
            WarehouseProduct warehouseProduct = new WarehouseProduct();
            warehouseProduct.setId(warehouseRequest.getId());
            warehouseProduct.setWproductid(warehouseRequest.getWproductid());
            warehouseProduct.setWproductname(warehouseRequest.getWproductname());
            warehouseProduct.setWproductprice(warehouseRequest.getWproductprice());
            toproduct.add(warehouseProduct);
        }
        try {
            daoimpl.saveAll(toproduct);
            statusMsg = "Data Inserted sucessfully";
        } catch (Exception e) {
            statusMsg = "Exception occured while Inserting the Data";
        }
        logger.info("***END--createmyproduct()-- product{}");
        return statusMsg;
    }

    @Override
    public List<WarehouseProductTO> getmyproduct() {
        logger.info("***START--getmyproduct()--");
        List<WarehouseProductTO> lisTo = new ArrayList<WarehouseProductTO>();
        List<WarehouseProduct> myproduct = daoimpl.findAll();
        for (WarehouseProduct warehouseProduct : myproduct) {
            WarehouseProductTO to = new WarehouseProductTO();
            to.setId(warehouseProduct.getId());
            to.setWproductid(warehouseProduct.getWproductid());
            to.setWproductname(warehouseProduct.getWproductname());
            to.setWproductprice(warehouseProduct.getWproductprice());
            lisTo.add(to);
        }
        logger.info("***START--getmyproduct()--RESPONSE{} " + lisTo);
        return lisTo;
    }

    @Override
    public List<WarehouseProductTO> getbyidmyproduct(int id) {
        logger.info("***START--getbyidmyproduct()-- id{}" + id);
        List<WarehouseProductTO> producrList = new ArrayList<WarehouseProductTO>();
        WarehouseProductTO to = new WarehouseProductTO();
        Optional<WarehouseProduct> productbyid = daoimpl.findById(id);
        logger.info("***productbyid ***" + productbyid);
        to.setId(productbyid.get().getId());
        to.setWproductid(productbyid.get().getWproductid());
        to.setWproductname(productbyid.get().getWproductname());
        to.setWproductprice(productbyid.get().getWproductprice());
        producrList.add(to);
        logger.info("***END--getbyidmyproduct()--RESPONSE{} " + producrList);
        return producrList;
    }

    @Override
    public String updatemyproduct(WarehouseRequest product) {
        logger.info("***START--updatemyproduct()-- product{}" + product);
        String statusMsg = "";
        WarehouseRequest myproduct = product;
        WarehouseProduct toproduct = new WarehouseProduct();
        toproduct.setId(myproduct.getId());
        toproduct.setWproductid(myproduct.getWproductid());
        toproduct.setWproductname(myproduct.getWproductname());
        toproduct.setWproductprice(myproduct.getWproductprice());
        try {
            daoimpl.save(toproduct);
            statusMsg = "Data Updated sucessfully";
        } catch (Exception e) {
            statusMsg = "Exception occured while Updating the Data";
        }
        logger.info("***END--updatemyproduct()-- product{}" + statusMsg);
        return statusMsg;
    }

    @Override
    public boolean deletemyproduct(int id) {
        logger.info("***START--deletemyproduct()-- id{}" + id);
        boolean success = false;
        daoimpl.deleteById(id);
        success = true;
        logger.info("***END--deletemyproduct()--");
        return success;
    }

}