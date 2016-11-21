import scala.annotation.tailrec

class Factorial {
	def factorialRegularRecursion(number: BigInt) : BigInt = { 
		if (number < 0) {
			throw new IndexOutOfBoundsException 
		}
		if (number == 0) {
			1 
		}
		else {
			number * factorialRegularRecursion(number - 1) 
		}
	}

	@tailrec
	final def factorialTailRecursion(number: BigInt, factorial: BigInt = 1): BigInt = { 
		if(number < 0) {
			throw new IndexOutOfBoundsException 
		}
		if (number == 0) {
			factorial 
		}
		else {
			factorialTailRecursion(number - 1, factorial * number) 
		}
	}
}