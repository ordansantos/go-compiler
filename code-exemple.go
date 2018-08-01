package main

type T string

func square (a float64) float64 {
	return a * a
}

func (x T) method (a float64, b float64) float64 {
	var n float64 = ((a + b) * 2 / 5)
	for i, c := range x {
		n = n * square(n / 2)
		for j, c := range x {
			n = n - square(n / 2)
			for k, c := range x {
				n = n + a / b + 1
			}
		}
	}
	return n
}

func main(){
	var t T = "just a random code"
	var a bool = 3 != t.method(1, 2) || t.method(3, 5) + (3 * 2 * 7 + (1 + 2) / 4) - 5 > 10 + 5;
	var answer = a == true
}
