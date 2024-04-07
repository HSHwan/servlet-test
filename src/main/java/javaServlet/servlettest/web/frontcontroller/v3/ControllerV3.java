package javaServlet.servlettest.web.frontcontroller.v3;

import javaServlet.servlettest.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
