function solution(date1, date2) {
    return new Date(date1.join('-')) < new Date(date2.join('-')) ? 1 : 0;
}