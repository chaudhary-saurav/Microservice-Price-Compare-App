package com.api.compare.rate.service;

import com.api.compare.rate.dao.ComparePortalDAO;
import com.api.compare.rate.dto.ComparePortalTO;
import com.api.compare.rate.model.ComparePortalProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComparePortalServiceImpl implements ComparePortalService {

    private final static Logger logger = LoggerFactory.getLogger(ComparePortalServiceImpl.class);

    @Autowired
    private ComparePortalDAO dao;

    @Override
    public String addProductFromManufacturer(List<ComparePortalTO> manufacturerProductDetails) {
        logger.info("START- addProductFromManufacturer{}" + manufacturerProductDetails);
        String statusmsg = "";
        try {
            for (ComparePortalTO amazonTO : manufacturerProductDetails) {
                ComparePortalProduct comparePortalProduct = new ComparePortalProduct();
                comparePortalProduct.setId(amazonTO.getId());
                comparePortalProduct.setProductid(amazonTO.getWproductid());
                comparePortalProduct.setProductname(amazonTO.getWproductname());
                comparePortalProduct.setProductprice(amazonTO.getWproductprice());
                dao.save(comparePortalProduct);

            }
            statusmsg = "Data Inserted successfully";
        } catch (Exception e) {
            statusmsg = "Exception occured during data insertion";
            logger.error("-Exception{}", e);
        }
        return statusmsg;

    }

    @Override
    public List<ComparePortalTO> getProductID() {
        logger.info("START- getProductID{}");
        List<ComparePortalTO> listOfProductid = new ArrayList<ComparePortalTO>();
        String statusmsg = "";
        try {
            List<ComparePortalProduct> CompareProductList = dao.findAll();

            for (ComparePortalProduct amazonProduct : CompareProductList) {

                ComparePortalTO to = new ComparePortalTO();

                to.setWproductid(amazonProduct.getProductid());


                listOfProductid.add(to);
            }

        } catch (Exception e) {
            statusmsg = "Exception occured during getProductID()";
            logger.error("-Exception{}", statusmsg);
        }
        logger.info("***END--getProductID()" + listOfProductid);
        return listOfProductid;
    }

}
