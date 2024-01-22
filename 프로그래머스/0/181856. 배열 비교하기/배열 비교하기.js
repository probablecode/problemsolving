function solution(arr1, arr2) {
    const ldiff = arr1.length - arr2.length;
    if (ldiff !== 0)
        return 0 < ldiff ? 1 : -1;
    const diff = arr1.reduce((s,v) => s + v) - arr2.reduce((s,v) => s + v);
        return 0 < diff ? 1 : (diff < 0 ? -1 : 0);
}