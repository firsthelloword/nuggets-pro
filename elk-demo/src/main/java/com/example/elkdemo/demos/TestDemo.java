package com.example.elkdemo.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhangyongkai
 * @date 2023/4/21 16:48
 */
public class TestDemo {

    public static void main(String[] args) {
        new TestDemo().letterCombinations("3");

    }

    public List<String> letterCombinations(String digits) {
        List<String> params = new ArrayList<>();
        String[] split = digits.split("");
        for (String s : split) {
            switch (s){
                case "2": params.add("abc"); break;
                case "3": params.add("def"); break;
                case "4": params.add("ghi"); break;
                case "5": params.add("jkl"); break;
                case "6": params.add("mno"); break;
                case "7": params.add("pqrs"); break;
                case "8": params.add("tvu"); break;
                case "9": params.add("wxyz"); break;
                default: break;
            }
        }
        for (String param : params) {
            System.out.println(param);
        }
        return null;
    }

    public void searchResult(List<String> params,List<String> result,List<String> results, int index){
        if(index == params.size()){

        }

    }

}
