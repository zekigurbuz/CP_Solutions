use std::io;

fn pow(a: i32, b: i32) -> i32 {
	if (b == 0) {
		return 1;
	}
	else {
		return a * pow(a, b - 1);
	}
}

fn main() {
	while(true) {
		println!("Please enter a number you'd like to test:");
		let mut n = String::new();
		io::stdin().read_line(&mut n).expect("No input!");
		let n: i32 = n.trim().parse().expect("Please input a number!");
		let mut d: i32 = 0;
		let mut cpn: i32 = n;
		if (n == 0) {
			println!("0 is an Armstrong number because 0^1 = 0");
			continue;
		}
		else if (n < 0) {
			println!("{} is not an Armstrong number because {} < 0", n, n);
			continue;
		}
		while (cpn > 0) {
			d = d + 1;
			cpn = cpn / 10;
		}
		let mut s = "".to_string();
		let mut ans: i32 = 0;
		cpn = n;
		while (cpn > 0) {
			if (cpn < n) {
				s = s + " + ";
			}
			s = s + &(cpn%10).to_string() + "^" + &d.to_string();
			ans = ans + pow(cpn%10, d);
			cpn = cpn / 10;
		}
		if (ans == n) {
			println!("{} is an Armstrong number because {} = {}", n, s, n);
		}
		else {
			println!("{} is not an Armstrong number because {} = {}", n, s, ans);
		}
	}
}
