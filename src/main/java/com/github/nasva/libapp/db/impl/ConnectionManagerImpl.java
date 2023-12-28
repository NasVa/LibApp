//package com.github.nasva.libapp.db.impl;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import com.github.nasva.libapp.db.ConnectionManager;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.Properties;
//
//@Component
//public class ConnectionManagerImpl implements ConnectionManager {
//
//    public ConnectionManagerImpl() {
//        try {
//            Properties prop = new Properties();
//            prop.load(ConnectionManager.class.getClassLoader().getResourceAsStream("datasource.properties"));
//            for (Object key : prop.keySet()) {
//                if (key instanceof String stringKey) {
//                    String envValue = System.getenv(stringKey.toUpperCase());
//                    if (envValue != null) {
////                        prop.setProperty(stringKey, envValue);
//                    }
//                }
//            }
//            HikariConfig config = new HikariConfig(prop);
//            ds = new HikariDataSource(config);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private final HikariDataSource ds;
//
//    @Override
//    public Connection getConnection() throws SQLException {
//        return ds.getConnection();
//    }
//}
