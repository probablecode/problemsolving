function solution(numLog) {
    var obj = {
        "1" : "w",
        "-1" : "s",
        "10" : "d",
        "-10" : "a",
    }
    
     var answer = '';
    
     for (i = 1; i < numLog.length; i++)
         answer += obj[numLog[i] - numLog[i - 1]];
     return answer;
//    return numLog.slice(1).map((v, i) => obj[v - numLog[i]]).join('');

}