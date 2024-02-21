Feature: Add new temperature alarm

    Scenario: User add new temperature alarm
        Given 현재 모드는 온도모드 이다.
        When 사용자는 B 버튼을 길게 눌러 TempSetting 모드를 실행한다.
        When 사용자는 B 버튼을 7회 눌러 40도로 설정한다.
        When 사용자는 A 버튼을 눌러 온도 알람 설정을 완료한다.
        Then 현재 온도알람을 표시한다(40도)
