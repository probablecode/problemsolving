function solution(array) {
    var answer = 0;
    var freq = Array(1000);
    //var freq = Array.from({ length : array.length}, (_, i) => 0);
    freq.fill(0);
    array.forEach((item) => {freq[item]++;});
    var max_ = Math.max(...freq);
    var maxIdx = freq.indexOf(max_);
    freq.splice(maxIdx, 1);
    if (Math.max(...freq) == max_)
        return (-1);
    else
        return(maxIdx);
}