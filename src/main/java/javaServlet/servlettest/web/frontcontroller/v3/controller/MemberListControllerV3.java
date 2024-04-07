package javaServlet.servlettest.web.frontcontroller.v3.controller;

import javaServlet.servlettest.domain.member.Member;
import javaServlet.servlettest.domain.member.MemberRepository;
import javaServlet.servlettest.web.frontcontroller.ModelView;
import javaServlet.servlettest.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members", members);
        return modelView;
    }
}
