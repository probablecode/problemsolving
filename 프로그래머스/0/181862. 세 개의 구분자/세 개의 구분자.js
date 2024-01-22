function solution(myStr) {
    const ret =  myStr.replaceAll('b', 'a').replaceAll('c', 'a').split('a').filter(v => v.length);
    return ret.length ? ret : ["EMPTY"];
}