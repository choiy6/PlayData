package controller;

import service.Service;

import java.util.Scanner;

public class Controller {
    private final Scanner sc;

    private final Service service;

    public Controller(Scanner sc){
        this.sc = sc;
        service = Service.getInstance();
    }

    /**
     * 기능 : 모드를 찾아 검색한다.
     * @param : None
     * @return : None
     */

    public void selectMode(){
        int mode;
        try {
            mode = Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            mode = 0;
        }
        if(mode == 1) {
//            TODO : insert 기능 만들것
            service.insert(sc.nextInt());
        }else if(mode == 2){
//            TODO : 전체 찾기 기능 만들것
        }else if(mode == 3){
//            TODO : 인덱스를 입력받아 찾는 기능 만들것
        }else{
//            TODO : selectMode 다시 실행 기능 만들것
        }

    }
}
