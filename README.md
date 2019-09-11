# Bowling Kata

## 活動內容

+ 已 pair programming 形式進行，一組 7 分鐘
  + 一位 driver (輸入程式碼的人)，一位 navigator (審查程式碼的人)
  + 下一輪時 navigator 變成 driver 跟下一個 navigator 再變成一組
+ 採自願排隊上台輪流 pair
+ 本次 coding dojo 採用的題目是 [PokerHands](https://en.wikipedia.org/wiki/List_of_poker_hands) 

## 活動目標

+ 上台膽量
+ 不是做完，是從別人身上偷學一些思考及技巧

## 活動規則

+ 要寫測試
+ 有紅燈時要先修測試
+ 有紅燈時不能重構
+ 要寫 production code 要有測試
+ 每一輪時間到的時候至少要可以編譯

## Rule

1. 每次遊戲有 10 局 (frame)
2. 每局有 10 個球瓶 (pins)，每局可以投擲 (roll) 兩球
3. 每局有 10 個球瓶 (pins) 可以被擊倒
4. 每局的分數為擊倒球瓶的總和，若 spare 或是 strike 則有額外的加分 (bonus)
5. 本局擊倒的球瓶總數為 10 時稱為 spare，bonus 為下一球擊倒球瓶的分數
6. 本局一次擊倒所有的球瓶時稱為 strike，bonus 為下兩球擊倒球瓶的分數總和
7. 當最後一局時產生 spare 或 strike 時則可以多打一局但只有一球

## Test Case

1. 0 0 0 0 0 0 0 0 0 0 -> score 0
2. x x x x x x x x x x x x -> score 300
3. 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 -> score 150
4. 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- -> score 90