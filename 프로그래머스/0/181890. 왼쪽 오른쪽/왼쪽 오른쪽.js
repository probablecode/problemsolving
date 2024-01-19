function solution(str_list) {
    var l = str_list.indexOf("l"), r = str_list.indexOf("r");
    if (r === -1 && l === -1)
        return [];
    if (r === -1)
        return str_list.slice(0, l);
    if (l === -1)
        return str_list.slice(r + 1);
    if (l < r)
        return str_list.slice(0, l);
    return str_list.slice(r + 1);
    
    // if (r === -1 || l < r)
    //     return str_list.slice(0, l);
    // else
    //     return str_list.slice(r + 1);
}