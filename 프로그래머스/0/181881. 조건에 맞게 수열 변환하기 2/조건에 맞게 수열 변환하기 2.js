function solution(arr) {
    var fct = ((v) => (v < 50 && v % 2 === 1) ? v * 2 + 1 : ((50 <= v && v % 2 === 0) ? v / 2 : v));
    var x = 0;
    var tmp = arr; 
    while (true) {
        var ttmp = tmp.map(v => fct(v));
        if (ttmp.every((v, i) => v === tmp[i]))
            break;
        tmp = ttmp;
        x++;
    }
    return x;
}