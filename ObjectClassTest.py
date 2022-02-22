from collections.abc import Set


class Student(object):
    #클래스(class)를 쓰고 함수를 정의한다. 여기서 함수는 Student로 정의한다
    #우리는 여기서 __init__로 Object를 초기화 작업을 한다.
    #이 메서드로 우리는 Student에게 name와 age라는 두 속성을 묶는 다.
    def __init__(self, name, age):
        self.name = name;
        self.age = age;
    #def는 defined라는 약자이고 정의(定義)라는 뜻임.
    #여기서 우리는 __init__(self)로 초기화하고, object의 첫 번째 필수 작업이죠!
    def study(self, course_name): #study(공부)라는 object객체
        print("%s공부중%s." % (self.name, course_name))

    def watch_movie(self): #watch_movie(영화관람)라는 객체
        if self.age < 19:
            print("%s 미성년자 관람가 입니다. " % self.name)
        else:
            print("%s 성인 관람가 입니다. " % self.name)

