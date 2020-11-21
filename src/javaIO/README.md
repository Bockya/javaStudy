# 자바IO

<hr>

#### 입출력을 위한 인터페이스와 클래스들

<img src="https://user-images.githubusercontent.com/39514117/99703061-016ba100-2ada-11eb-96c7-3abe9bc505ca.png" style="zoom:50%;" />

- 자바 IO는 크게 <u>byte단위 입출력</u>과 <u>문자 단위 입출력</u>클래스로 나뉩니다.
  - **byte단위** 입출력클래스는 모두 <u>InputStream</u>과 <u>OutputStream</u>이라는 추상클래스를 상속받아 만들어집니다.
  - **문자(char)단위** 입출력클래스는 모두 <u>Reader</u>와 <u>Writer</u>라는 추상클래스를 상속받아 만들어집니다.
- 4가지 추상클래스(InputStream,OutputStreamReader,Reader,Writer)를 받아들이는 생성자가 있다면, 다양한 입출력방법을 제공하는 클래스입니다.
- 4가지 클래스를 받아들이는 생성자가 없다면, 어디로부터 입력받을 것인지, 어디에 쓸것인지를 나타내는 클래스입니다.

<img src="https://user-images.githubusercontent.com/39514117/99703203-2b24c800-2ada-11eb-948e-37d76193f923.png" style="zoom:55%;" />

- **파일**로 부터 입력받고 쓰기 위한 클래스 : <u>FileInputStream</u>, <u>FileOutputStream</u>, <u>FileReader</u>, <u>FileWriter</u>
- **배열**로 부터 입력받고 쓰기 위한 클래스 : <u>ByteArrayInputStream</u>, <u>ByteArrayOutputStream</u>, <u>CharReader</u>, <u>CharWriter</u>
  - 해당 클래스들은 <u>어디로부터, 어디에</u>라는 대상을 지정할 수 있는 IO클래스입니다. 이런 클래스를 <u>장식대상 클래스</u>라고 합니다.
- <u>DataInputStream</u>, <u>DataOutputStream</u>같은 클래스를 보면 <u>다양한 데이터 형</u>을 입력받고 출력합니다.
- <u>PrintWriter</u>는 다양하게 <u>한줄 출력</u>하는 <u>pintln()</u>메소드를 가지고있습니다.
- <u>BufferedReader</u>는 <u>한줄 입력</u>받는 <u>readLine()</u>메소드를 가집니다.
  - 이런 클래스들은 다양한 방식으로 입력하고, 출력하는 기능을 제공합니다. 이런 클래스를 <u>장식하는 클래스</u>라고 합니다.

<hr>

#### Byte 단위 입출력

Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝납니다.

- 파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성
  - 파일로 부터 읽어오기 위한 객체 - FileInputStream
  - 파일에 쓸수 있게 해주는 객체 - FileOutputStream .
- read()메소드가
  - byte를 리턴한다면 **끝을 나타내는 값(-1)을 표현**할 수가 없기 때문에, <u>byte가 아닌 **int를 리턴**</u>한다.
  - 음수의 경우 <u>맨 좌측 비트가 1(1000)</u>이 된다. 읽어들일 것이 있다면 항상 양수(0000)를 리턴한다고볼 수 있다. .
- FileInputStream과 FileOutputStream을 이용하여, <u>1바이트씩 읽어들여 1바이트씩 저장</u>
  - read()메소드가 리턴하는 타입은 정수인데, 정수 4바이트중 <u>마지막 바이트</u>에 읽어들인 1바이트를 저장한다.
  - read()메소드는 더이상 읽어들일 것이 없을때 **-1을 리턴**한다.

<hr>

#### Byte 단위 입출력 심화

Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝납니다.

- 파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램을 작성
  - byte[] buffer = new byte[512];
  - 512byte만큼 읽어 들이기 위해 byte배열을 사용
- System.currentTimeMillis();
  - 현재 시간을 롱타입으로 반환한다.

<img src="https://user-images.githubusercontent.com/39514117/99703277-442d7900-2ada-11eb-92fe-3f8222752ae3.png" style="zoom:55%;" />

- OS는 1byte씩 읽는다 해도 **512byte**를 읽어와서 511byte를 버린다.
  - 따라서 512byte로 처음 읽어 들이는 게 효율적이다.

<hr>

#### 다양한 타입의 출력

- **try-with-resources** 블럭 선언
  - 사용한 자원을 자동으로 종료시켜주는 기능
  - java io객체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 한다.
  - close()메소드를 사용자가 호출하지 않더라도, Exception이 발생하지 않았다면 <u>자동으로 close()</u>가 되게 할 수 있는 방법  
- 다양한 타입으로 저장 할 수 있는 DataOutputStream
  - wirteInt() - 정수값으로 저장
  - wirteBoolean() - boolean값으로 저장
  - writeDouble() - double 값으로 저장

<hr>

#### 다양한 타입의 입력

- data.txt로부터 값을 읽어들여 화면에 출력하는 클래스
- 다양한 타입의 데이터를 읽어낼 수 있는 DataInputStream
  - readInt() -정수를 읽어들이는 메소드
  - readBoolean() - boolean 값을 읽어들이는 메소드
  - readDouble() - douboe 값을 읽어들이는 메소드
- 파일에 저장된 순서대로 읽어 들여야한다.
  - int, boolean, double순서대로 저장하였기 때문에 읽어들일 때도 <u>같은 순서로 읽어야</u> 한다.

<hr>

#### Char 단위 입출력(Console)

char단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝이 납니다.

- char단위 입출력 클래스를 이용해서 키보드로 부터 한줄 입력 받아서 콘솔에 출력
  - **System.in** - <u>키보드</u>를 의미 (InputStream )
  - **BufferedReader** - <u>한 줄씩 입력 받기</u> 위한 클래스
  - BufferedReader 클래스의 생성자는 <u>InputStream을 입력받는 생성자가 없다</u>.
  - <u>System.in은 InputStream 타입</u>이므로 BufferedReader의 생성자에 바로 들어갈 수 없으므로 **InputStreamReader** 클래스를 이용해야함.

<hr>

#### Char 단위 입출력(File)

char단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝이 납니다.

- 파일에서 한 줄씩 입력 받아서 파일에 출력
  - <u>파일에서 읽기</u> 위해서 **FileReader** 클래스 이용
  - <u>한 줄 읽어 들이기</u> 위해서 **BufferedReader** 클래스 이용
    - BufferedReader 클래스가 가지고 있는 **readLine()** 메소드가 한줄씩 읽게 해준다.
    - readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 <u>null을 리턴</u>한다.
  - <u>파일에 쓰게하기</u> 위해서 **FileWriter** 클래스 이용
  - <u>편리하게 출력하기</u> 위해서 **PrintWriter** 클래스 이용