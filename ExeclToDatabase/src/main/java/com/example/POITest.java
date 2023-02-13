package com.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class POITest {
    private static Connection connection = null;
    private static Statement statement = null;

    /**
     * 链接数据库
     */
    public static boolean connectDB(){
        String url = "";
        String username = "";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("jdbc驱动失败");
            return false;
        }
       return true;
    }
    /**
     * 导入文件数据到数据库
     */
    public static boolean readExeclToDataBase(){
        POIFSFileSystem fs = null;
        HSSFWorkbook wb = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(""));
            wb = new HSSFWorkbook();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取文件失败");
            return false;
        }
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow row = null;
        HSSFCell cell = null;
        String first = "";
        int romNum,cellNum;
        romNum = sheet.getLastRowNum();
        for(int i = 0;i<=romNum;i++){
            row = sheet.getRow(i);
            cellNum = row.getLastCellNum();
            String sql = "";
            try {
                statement.execute(sql);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("执行sql失败");
                return false;
            }
        }
        return true;
    }
}
