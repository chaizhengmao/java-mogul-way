package com.cimu.test;

import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author: zhengmao_chai
 * @date: 2021/7/26 16:18
 * @since: 1.0.0
 */
public class JULLogTest {

    @Test
    public void test01() {
        Logger logger = Logger.getLogger("com.cimu.test");
        logger.setLevel(Level.CONFIG);
        logger.log(Level.ALL, "all.....");
        logger.info("info.....");
        logger.warning("warning.....");
        logger.config("config.....");
        logger.fine("fine.....");
        logger.finer("finer.....");
        logger.finest("finest.....");
        logger.log(Level.SEVERE, "severe.....");
        logger.log(Level.OFF, "off.....");
    }

    @Test
    public void test02() {
        Logger logger = Logger.getLogger("com.cimu.test");
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();
        logger.addHandler(handler);
        handler.setFormatter(formatter);
        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);
        logger.setLevel(Level.CONFIG);
        logger.log(Level.ALL, "all.....");
        logger.info("info.....");
        logger.warning("warning.....");
        logger.config("config.....");
        logger.fine("fine.....");
        logger.finer("finer.....");
        logger.finest("finest.....");
        logger.log(Level.SEVERE, "severe.....");
        logger.log(Level.OFF, "off.....");
    }
}
