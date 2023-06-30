# kotlin-minesweeper

## 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.

* 높이와 너비, 지뢰 개수를 입력받을 수 있다.
* 지뢰는 눈에 잘 띄는 것으로 표기한다.
* 지뢰는 가급적 랜덤에 가깝게 배치한다.


## 실행결과
```text
높이를 입력하세요.
10

너비를 입력하세요.
10

지뢰는 몇 개인가요?
10

지뢰찾기 게임 시작
C C C * C C C * C C
C C * C * C C C C C
C C C C C C C C C C
C C C C C C C C C C
* C C C C C C C C C
C C C C C C * C C C
C C * C C C * C C C
C C C C C C * C C *
C C C C C C C C C C
C C C C C C C C C C
```

## 기능구현목록 정리

* [x] View
  * Inputview
    * 높이를 물어보고 Int 를 리턴한다
    * 너비를 물어보고 Int 를 리턴한다
  * OutputView
    * 도메인을 넘겨받아 그림을 표시해줄 수 있어야 한다
    * 지뢰찾기 게임 시작이라는 메시지를 화면에 표시해줄 수 있다
* [x] 보드 사이즈
  * 지뢰찾기게임판의 사이즈 (차원)을 대표한다
  * 현재는 너비와 높이 (2차원) 을 보여준다
  * Int 타입으로 각 프로퍼티를 갖는다
* [x] 핀
  * 현재는 지뢰 혹은 정상 2가지 타입을 갖는다
  * 특별한 기능을 갖고 있지는 않는다
* [x] 정상
  * C 라는 키워드로 자신의 위치를 표시해준다
* [x] 지뢰
  * \* 라는 키워드로 자신의 위치를 표시해준다
* [ ] 게임 보드
  * 보드 사이즈를 주입받아 해당 크기만큼 핀을 생성한다
  * 특정 전략을 주입받아 지뢰를 입력받는다