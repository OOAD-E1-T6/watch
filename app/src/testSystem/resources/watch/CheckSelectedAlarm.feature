Feature: Check selected alarm

    Scenario: 사용자는 현재 설정된 알람을 확인한다.
        Given 현재 모드는 StopWatch 이다.
        Given 현재 설정된 알람 시간은 13시 45분 이다.
        When 사용자는 C 버튼을 누른다.
        Then 현재 알람시간을 표시한다(13시 45분).