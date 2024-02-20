Feature: Add new alarm

    Scenario: User add new alarm
        Given 현재 모드는 알람모드 이다.
        When 사용자는 B 버튼을 길게 눌러 addAlarm을 실행한다.
        When 사용자는 D 버튼을 3회 눌러 3시로 설정한다.
        When 사용자는 C 버튼을 눌러 min 설정으로 커서를 옮긴다.
        When 사용자는 D 버튼을 23회 눌러 min을 23분으로 설정한다.
        When 사용자는 A 버튼을 눌러 Alarm 추가를 완료한다.
        Then 현재 알람시간을 표시한다(3시 23분)
