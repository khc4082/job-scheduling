# Job scheduling
                                                  201801658 김현성
### 작업 스케줄링(Job scheduling)

  `작업 스케줄링(Job Scheduling) 문제`는 n개의 작업, 각 작업의 수행 시간 ti, i = 1,2,3,…,n, 그리고 m개의 동일한 기계가 주어질 때, 모든 작업이 가장 빨리 종료되도록 작업을 기계에 배정하는 문제이다. 단, 한 작업은 배정된 기계에서 연속적으로 수행, 기계는 1번에 하나의 작업만을 수행한다.
  
  작업 스케줄링 문제를 해결하기 위한 가장 간단한 방법은 `그리디 알고리즘`을 이용하는 것이다.
  즉, 배정된 작업이 가장 빨리 끝나는 기계에 새 작업을 배정하는 것이다.

### 작동 구조

  Approx_JobScheduling
  
 * 입력 : 4, 8, 16개의 작업       
  작업시간 = 10초이내      
  기계의 개수 M= 2   
  
 * 출력 : 모든 작업이 종료된 시간

![image](https://user-images.githubusercontent.com/80371590/118577807-0b8b0580-b7c6-11eb-9893-c5ceb5f979a9.png)

### 결과 도출

 * 작업의 개수가 4일 때,
  
![image](https://user-images.githubusercontent.com/80371590/118578227-be5b6380-b7c6-11eb-9e03-430ab448dd24.png)

 * 작업의 개수가 8일 때,
  
![image](https://user-images.githubusercontent.com/80371590/118578297-dcc15f00-b7c6-11eb-98f6-44c13d5585a7.png)

 * 작업의 개수가 16일 때,
  
![image](https://user-images.githubusercontent.com/80371590/118578330-ecd93e80-b7c6-11eb-9b33-e91abf4f6856.png)

### 시간복잡도

  Approx_JobScheduling 알고리즘은 n개의 작업을 하나씩 가장 빨리 끝나는 기계에 배정한다.   
  이러한 기계를 찾기 위해 for-루프가 (m-1)번 수행된다.   
  따라서 O(m) 시간 동안 기계의 작업 종료 시간을 살핀다.   
  또한, n개의 작업을 배정하고, 마지막 `L[min] = L[min] + ti`에서 배열을 탐색한다.   
 * `n*O(m) + O(m) = O(nm)`   
  
### 근사비율

  Approx_JobScheduling 알고리즘의 근사해를 OPT’, 최적해를 OPT라고 한다.   
* `OPT’ <= 2*OPT이다.`  

![image](https://user-images.githubusercontent.com/80371590/118579133-72112300-b7c8-11eb-81eb-5d98c8d8f94c.png)

* 작업시간이 4일때 작업시간 2 4 5 7   
`근사해 11`
* 작업시간 8일때 작업시간 7 4 6 7 8 8 6 3   
`근사해 25`
* 작업시간 16일때 작업시간 9 10 7 3 8 10 8 8 3 8 2 2 9 2 6 1   
`근사해 48`   
   
이로써 공식을 만족 할 수 있게된다.


