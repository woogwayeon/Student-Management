package StudentManagement;

import java.util.Scanner;
import java.util.ArrayList;

public class MemberMenu {

    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    int menu;


    public void menuProcess(ArrayList<Member> memberList)
    {
        System.out.println("===================================================");
        System.out.println("============== 학생 관리 프로그램 ==== ver_1.0 =======");
        System.out.println("===================================================");

        while( flag )
        {
            System.out.println("아래 메뉴를 입력해주세요!");
            System.out.println("1. 추가 / 2. 검색 / 3. 수정 / 4. 삭제 / 5. 전체출력 / 6. 데이터 초기화 / 7. 종료 ");
            menu = sc.nextInt();

            switch(menu)
            {
                case 1:  // 추가
                    memberList.add(infoInput());
                    System.out.println();
                    break;

                case 2:  // 검색

                    int resultIdx = search(memberList);

                    if( resultIdx == -1 )
                    {
                        System.out.println("검색 결과 없음!");
                    }else
                    {
                        Member m = memberList.get(resultIdx);
                        System.out.println("찾은 결과는 아래와 같습니다");
                        System.out.println(m.toString());
                    }
                    break;

                case 3:  // 수정

                    resultIdx = search(memberList);
                    if( resultIdx == -1 )
                    {
                        System.out.println("검색 결과 없음!");
                    }else
                    {
                        Member m = memberList.get(resultIdx);
                        updateMember(m);
//                        memberList.set(resultIdx, m);
                        System.out.println("찾은 결과는 아래와 같습니다");
                        System.out.println(m.toString());
                    }
                    break;

                case 4:  // 삭제
                    resultIdx = search(memberList);
                    if( resultIdx == -1 )
                    {
                        System.out.println("삭제할 데이터를 찾지 못했습니다!");
                    }else
                    {
                        memberList.remove(resultIdx);
                        System.out.println("삭제되었습니다");
                    }
                    break;

                case 5:  // 전체출력
                    if(memberList.size()==0)
                    {
                        System.out.println("데이터가 없습니다");
                    }else
                    {
                        for(  Member m : memberList )
                        {
                            System.out.println(m.toString());
                        }
                    }
                    break;

                case 6:  // 데이터 초기화
                    if(memberList.size()==0)
                    {
                        System.out.println("데이터가 없어용");
                    }else
                    {
                        memberList.removeAll(memberList);
                        System.out.println("데이터를 전체 초기화했습니다");
                    }

                    break;

                case 7:  // 종료
                    System.out.println("프로그램이 종료되었습니다");
                    flag = false;
                    break;

                default:
                    System.out.println("똑바로 입력해 다시 잘 보고 ㅡㅡ !");
                    System.out.println();
            }
        }


    } // menuProcess()

    Member infoInput()
    {
        sc = new Scanner(System.in);

        System.out.println("넘버를 입력하세요");
        int no = sc.nextInt();

        System.out.println("학번(id)을 입력하세요");
        String id = sc.next();

        System.out.println("이름을 입력하세요");
        String name = sc.next();

        System.out.println("전화번호를 입력하세요");
        String tel = sc.next();

        System.out.println("주소를 입력하세요");
        String address = sc.next();

        System.out.println("순위를 입력하세요");
        int ranking = sc.nextInt();

        System.out.println("성별을 입력하세요");
        String gender = sc.next();

        Member member = new Member( no,id, name, tel, address, ranking, gender);

        return member;

    } // infoInput()

    Member updateMember(Member m)
    {
        sc = new Scanner(System.in);

        // 이름 교체
        System.out.println("이름을 바꾸시겠습니까? (바꾸려면 y, 아니면 아무키나 입력)");
        if(sc.next().equals("y"))
        {
            System.out.println("바꿀 이름을 입력하세요");
            String name = sc.next();
            m.setName(name);
        }

        // 전화번호 교체
        System.out.println("전화번호를 바꾸시겠습니까? (바꾸려면 y, 아니면 아무키나 입력)");
        if(sc.next().equals("y"))
        {
            System.out.println("바꿀 전화번호를 입력하세요");
            String tel = sc.next();
            m.setTel(tel);
        }

        // 주소 교체
        System.out.println("주소를 바꾸시겠습니까? (바꾸려면 y, 아니면 아무키나 입력)");
        if(sc.next().equals("y"))
        {
            System.out.println("바꿀 주소를 입력하세요");
            String address = sc.next();
            m.setAddress(address);
        }

        // 성별 교체
        System.out.println("성별을 바꾸시겠습니까? (바꾸려면 y, 아니면 아무키나 입력)");
        if(sc.next().equals("y"))
        {
            System.out.println("바꿀 성별을 입력하세요");
            String gender = sc.next();
            m.setGender(gender);
        }

        return m;

    } // infoInput()



    int search(ArrayList<Member> memberList)
    {
        System.out.println("학생의 학번은?");
        String searchId = sc.next();  // id가 찾고자 하는 학생번호
        int result = -1;

        for( int i = 0; i<memberList.size(); i++ )
        {
            Member m = memberList.get(i);

            if(searchId.equals(m.getId()))
            {
                // i의 값은 찾은 것의 인덱스. 찾은 결과 i번째 객체!
                result = i;
                break;
            }
        }

        return result;

    } // search();

} // MemberMenu
