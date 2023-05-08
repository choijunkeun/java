//package webSite;
//
//import java.util.*;
//
//import static webSite.Error.NUM_ERR;
//import static webSite.Error.SEARCHERR;
//
//class WebSite {
//    int flagSize = 0;               // 열어본 웹사이트 스택포인터
//    Scanner scan;
//    Stack stackFlag = new Stack(); // 이제까지 열어 본 웹사이트 전체
//    Stack stackTemp = new Stack(); // 뒤로가기 시 저장할 웹사이트
//
//    WebSite() { // 기본 생성자
//       this.scan = new Scanner(System.in);
//    }
//
//    int webMenu() throws WebException {    // 웹사이트 메뉴
//        System.out.println("웹으로 시작한 웹사이트");
//        System.out.println("0. 종료");
//        System.out.println("1. 웹사이트 검색하여 접속");
//        System.out.println("2. 앞으로가기");
//        System.out.println("3. 뒤로가기");
//        System.out.println(">>>>>선택하세요");
//        int select = Integer.parseInt(this.scan.nextLine());
//        if (select >= 0 && select <= 3) {
//            return select;
//        } else {
//            throw new WebException("메뉴에러", NUM_ERR);
//        }
//    }
//
//    String webSearch() throws Exception {
//        System.out.println("접속 할 웹사이트를 입력해주세요:::>>>>>>>");
//        String siteDomain = String.valueOf(this.scan.nextLine());
//
//        System.out.println(siteDomain);
//        System.out.println("siteDomain");
//
//        if(siteDomain == null && "".equals(siteDomain)) {
//            throw new WebException("잘못된도메인", SEARCHERR);
//        }
//
//        return siteDomain;
//    }
//
//    void backWeb() {    // 뒤로가기
//        if(!stackTemp.empty()) {
//            stackFlag.push(stackTemp.pop());
//        } else {
//            System.out.println("뒤로 갈 사이트가 없습니다.");
//        }
//    }
//
//    void frontWeb() {   // 앞으로 가기
//        if(flagSize > 0 && !stackTemp.empty()) {
//            stackTemp.push(stackFlag.pop());
//        } else {
//            System.out.println("앞으로 갈 사이트가 없습니다.");
//        }
//    }
//
//}
//
//public class WebSiteStack {
//    public static void main(String args[]) throws WebException {
//        WebSite web = new WebSite();
//
//        while(true) {
//            while(true) {
//                try {
//                    int select = web.webMenu();
//                    switch(select) {
//                        case 0:
//                            return;
//                        case 1:
//                            web.webSearch();
//                            break;
//                        case 2:
//                            web.frontWeb();
//                            break;
//                        case 3:
//                            web.backWeb();
//                            break;
//                    }
//                } catch (WebException exc) {
//                    System.out.println("***********" + exc + "***********");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//
//        }
//    }
//}
//
