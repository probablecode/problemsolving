function solution(n, s, num_list) {
    return num_list.filter((it, i) => {
        switch (n) {
            case 1 :
                return (i <= s[1]);
            case 2 :
                return (s[0] <= i);
            case 3 :
                return (s[0] <= i && i <= s[1]);
            case 4 :
                return (s[0] <= i && i <= s[1] && (i - s[0]) % s[2] === 0);
        }
        return false;
    });
}