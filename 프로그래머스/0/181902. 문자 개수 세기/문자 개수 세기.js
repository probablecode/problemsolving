function solution(my_string) {
  const arr = new Array(52).fill(0);
	const uA = 'A'.charCodeAt(0); 	
	const lA = 'a'.charCodeAt(0);
    const alen = 'Z'.charCodeAt(0) - uA + 1;
  for (const char of my_string) {
		const c = char.charCodeAt(0);
    arr[lA <= c ? alen + c - lA : c - uA]++;
  }
  return arr;
}