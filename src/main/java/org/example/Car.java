package org.example;


class 병사 {
    String 이름;
    int 계급번호;
    병사 () {
        계급번호 = 1;
    }

    void 자기소개() {
        String 계급 = "";
        if (계급번호 == 1) {
            계급 = "이병";
        } else if (계급번호 == 2) {
            계급 = "일병";
        } else if (계급번호 == 3) {
            계급 = "상병";
        }
        System.out.println("안녕하세요. 저는 홍길동 " + 계급 + "입니다.");
    }

    void 공격() {
        int 공격력 = 1;
        if (계급번호 == 1) {
            공격력 = 7;
        } else if (계급번호 == 2) {
            공격력 = 9;
        } else if (계급번호 == 3) {
            공격력 = 11;
        }
        System.out.println("홍길동 이병이 공격합니다.(공격력 :" + 공격력 + ")");
    }

//    int get공격력() {
//        int 공격력 = 1;
//        if (계급번호 == 1) {
//            공격력 = 7;
//        } else if (계급번호 == 2) {
//            공격력 = 9;
//        } else if (계급번호 == 3) {
//            공격력 = 11;
//        } return 공격력;
//    }




    void 진급() {
        계급번호++;
    }
}

