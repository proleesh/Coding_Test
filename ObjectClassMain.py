from ObjectClassTest import Student


def main():
    # 여기서 student의 정보를 생성 그리고 name와 age에 데이터를 넣는다
    stu1 = Student("성혁", 24) #name : 성혁 age : 24
    stu1.study("파이썬을 배우고 있습니다.") #study에게 알림을 보내준다
    stu1.watch_movie("전쟁영화를 시청하고 있습니다.") #watch_movie에게 알림을 보내준다

    stu2 = Student("하하", 32)
    stu2.study("신기술을 배우고 있습니다. ")
    stu2.watch_movie("공포영화를 시청하고 있습니다.")


    if __name__ == "__main__":
        main()
