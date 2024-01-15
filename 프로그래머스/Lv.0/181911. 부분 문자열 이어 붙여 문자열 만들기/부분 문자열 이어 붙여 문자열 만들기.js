function solution(my_strings, parts) {
    return my_strings.map((str, i) => { return str.substring(parts[i][0], parts[i][1] + 1) }).join('');
}