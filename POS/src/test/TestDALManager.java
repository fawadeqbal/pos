/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dal.DALManager;
import java.util.ArrayList;
import model.dto.ProductDTO;
import model.dto.Response;

/**
 *
 * @author fawad
 */
public class TestDALManager {

    public static void main(String[] args) {
        DALManager dal = new DALManager();
        ProductDTO p = new ProductDTO();
        p.setProductName("oil");
        p.setBarcode("123456");
        p.setPrice(260.0);
        p.setStockQuantity(12);
        p.setQuantityType("weigted");
        p.setCategoryId(1);
        Response res = new Response();
        dal.addProduct(p, res);
       ArrayList<ProductDTO> list=dal.getProducts(res);
       for(ProductDTO p1 : list){
                System.out.println(p1);
            }
        if (res.isSuccessfull()) {
            System.out.println(res.getInfoMessages());
        }else{
            System.out.println(res.getErrorMessages());
        }
    }
}
