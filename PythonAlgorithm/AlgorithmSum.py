'''
체스판은 8*8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.


입력

첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.

출력
 

첫째 줄에 문제의 정답을 출력한다.

'''
def solution(ches):
    count = 0;
    a = 0;
    for i in range(0,len(ches),1):
        if(i>0 and i%8 ==0):
            a+=1
        if((a % 2 == 0 and i % 2 == 0 and ches[i] == 'F') or (a % 2 != 0 and i % 2 != 0 and ches[i] == 'F')):
           count+=1

    return count;

ches = ".F.F...FF...F.F....F.F.FF.F...F..F...F..F...F.F..F.F.F.F..FF..F."
print("answer: {}".format(solution(ches)))