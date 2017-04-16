package com.dsa.calculator;

import com.dsa.model.ArraySimpleList;
import com.dsa.model.Position;
import com.dsa.model.SimpleList;
import com.dsa.model.UtilityOperations;

public class LongInteger {

	// DO NOT CHANGE OR REMOVE THIS LINE (UNTIL STEP 3)
	@SuppressWarnings("rawtypes")
	// private SimpleList list = new SLLSimpleList();

	private SimpleList list = new ArraySimpleList();

	// String a;
	boolean sign = false;

	public LongInteger(String s) {
		int value = 0;
		String ready = "";
		for (int i = s.length() - 1; i >= 3; i = i - 4) {
			// SSystem.out.println("inside FOR-1 & value of i is :");
			// System.out.println("value of i"+i);
			for (int j = i - 3; j <= i; j++) {
				// System.out.println("value of j" +j);
				char c = s.charAt(j);
				if (c == '-') {
					sign = this.setSign();
				} else {
					ready = ready + c;
					int demo = Integer.parseInt(ready);
					// System.out.println(demo);
					value = demo;
				}
			}
			ready = "";
			// System.out.print("before insertlast");
			// if(list.isEmpty()){
			// System.out.println("empty list");
			// }
			// else System.out.println("Success");
			// System.out.println("--" +value);
			// System.out.println("After insertlast");
			list.insertLast(value);
			// if(list.isEmpty()){
			// System.out.println("empty list");
			// }
			// else System.out.println("Success");
		}
		ready = "";
		if (s.length() % 4 == 0) {
			// System.out.println("Finished");
		} else {
			// System.out.println("Start");
			if (s.length() % 4 == 1) {
				char c = s.charAt(0);
				if (c == '-') {
					sign = this.setSign();
				} else {
					ready = ready + c;
					int demo = Integer.parseInt(ready);
					value = demo;
					// System.out.print("--"+value);
					list.insertLast(value);
				}
			} else {
				for (int i = 0; i < s.length() % 4; i++) {
					char c = s.charAt(i);
					if (c == '-') {
						sign = this.setSign();
					} else {
						ready = ready + c;
						int demo = Integer.parseInt(ready);
						value = demo;
					}
				}
				// System.out.print("--"+value);
				list.insertLast(value);
			}
		}
		// System.out.println("Linklist creation successfull");
		// int rec1 = list.size();
		// System.out.println("\n" +rec1);

		/*
		 * if(list.isEmpty()){ System.out.println("empty list"); } else
		 * System.out.println("Success");
		 */
	}

	public LongInteger() {

	}

	@SuppressWarnings("unchecked")
	public void traverse() {
		Position ob = this.list.last();
		int max = this.list.size();
		for (int j = 1; j <= max; j++) {
			if (!this.getSign() && j == 1)
				System.out.print(+ob.getValue() + " ");
			else if (ob != this.list.last() && ob.getValue() < 1000) {
				if (ob.getValue() == 0)
					System.out.print("000" + ob.getValue() + " ");
				else if (ob.getValue() < 10)
					System.out.print("000" + ob.getValue() + " ");
				else if (ob.getValue() < 100)
					System.out.print("00" + ob.getValue() + " ");
				else
					System.out.print("0" + ob.getValue() + " ");
			} else
				System.out.print(ob.getValue() + " ");
			if (j != max)
				ob = this.list.before(ob);
		}

	}

	@SuppressWarnings("unchecked")
	public void output() {
		Position ob = this.list.last();
		int max = this.list.size();
		for (int j = 1; j <= max; j++) {
			if (this.getSign() && j == 1) {
				System.out.print("-" + ob.getValue());
			} else if (!this.getSign() && j == 1)
				System.out.print("+" + ob.getValue());
			else if (ob != this.list.last() && ob.getValue() < 1000) {
				if (ob.getValue() == 0)
					System.out.print("000" + ob.getValue());
				else if (ob.getValue() < 10)
					System.out.print("000" + ob.getValue());
				else if (ob.getValue() < 100)
					System.out.print("00" + ob.getValue());
				else
					System.out.print("0" + ob.getValue());
			} else
				System.out.print(ob.getValue());
			if (j != max)
				ob = this.list.before(ob);
		}
		// System.out.println();
	}

	public boolean getSign() {
		if (sign == false)
			return false;
		else
			return true;
	}

	public boolean setSign() {
		sign = true;
		return true;
	}

	public int getDigitCount() {
		int digit;
		digit = (this.list.size() - 1) * 4;
		int lastvalue = this.list.last().getValue();
		int last = UtilityOperations.digits(lastvalue);
		digit = digit + last;
		return digit;

	}

	@SuppressWarnings("unchecked")
	public boolean equalTo(LongInteger i) {
		if (this.sign != i.sign)
			return false;
		else if (this.getDigitCount() != i.getDigitCount())
			return false;
		else {
			int max = this.list.size();
			// Object ob1 = new Object();
			// Object ob2= new Object();
			Position ob1 = this.list.last();
			Position ob2 = i.list.last();
			for (int j = 1; j < max; j++) {
				if (ob1.getValue() != ob2.getValue())
					return false;
				else if (j == max)
					return true;
				else {
					ob1 = this.list.before(ob1);
					ob2 = i.list.before(ob2);
				}
			}
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean lessThan(LongInteger i) {
		if (this.sign == true && i.sign == false)
			return true;
		else if (this.sign == false && i.sign == true)
			return false;
		else {
			if (this.getDigitCount() != i.getDigitCount()) {
				if ((this.sign == true && i.sign == true) && this.getDigitCount() > i.getDigitCount())
					return true;
				else if ((this.sign == true && i.sign == true) && this.getDigitCount() < i.getDigitCount())
					return false;
				else if ((this.sign == false && i.sign == false) && this.getDigitCount() > i.getDigitCount())
					return false;
				else if ((this.sign == false && i.sign == false) && this.getDigitCount() < i.getDigitCount())
					return true;

			} else {
				int max = this.list.size();
				// Object ob1 = new Object();
				// Object ob2= new Object();
				Position ob1 = this.list.last();
				Position ob2 = i.list.last();
				for (int j = 1; j < max; j++) {
					if (ob1.getValue() < ob2.getValue()) {
						if (this.sign == true && i.sign == true)
							return false;
						else
							return true;
					} else if (ob1.getValue() > ob2.getValue() && this.sign == true && i.sign == true)
						return true;
					else if (j == max)
						return false;
					else {
						ob1 = this.list.before(ob1);
						ob2 = i.list.before(ob2);
					}
				}
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean greaterThan(LongInteger i) {
		if (this.sign == true && i.sign == false)
			return false;
		else if (this.sign == false && i.sign == true)
			return true;
		else {
			if (this.getDigitCount() != i.getDigitCount()) {
				if ((this.sign == true && i.sign == true) && this.getDigitCount() > i.getDigitCount())
					return false;
				else if ((this.sign == true && i.sign == true) && this.getDigitCount() < i.getDigitCount())
					return true;
				else if ((this.sign == false && i.sign == false) && this.getDigitCount() > i.getDigitCount())
					return true;
				else if ((this.sign == false && i.sign == false) && this.getDigitCount() < i.getDigitCount())
					return false;

			} else {
				int max = this.list.size();
				// Object ob1 = new Object();
				// Object ob2= new Object();
				Position ob1 = this.list.last();
				Position ob2 = i.list.last();
				for (int j = 1; j < max; j++) {
					if (ob1.getValue() > ob2.getValue()) {
						if (this.sign == true && i.sign == true)
							return true;
						else
							return false;
					} else if (j == max)
						return false;
					else {
						ob1 = this.list.before(ob1);
						ob2 = i.list.before(ob2);
					}
				}
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public LongInteger add(LongInteger i) {
		int loop;
		int add;
		int carry = 0;
		LongInteger p = new LongInteger();

		if (this.getSign() == i.getSign()) {
			// System.out.println("this should not be seen");
			// System.out.println("this is the i & this sign : "+i.getSign()+" &
			// "+this.getSign());
			// System.out.println("this is the sign of this and i :
			// "+this.getSign()+i.getSign());
			// System.out.println("this is the p sign : "+p.getSign());
			if (this.getSign())
				p.setSign();
			Position ob1 = this.list.first();
			Position ob2 = i.list.first();
			// int x = ob1.getValue();
			// int y = ob2.getValue();
			// System.out.println("sign of answer"+p.getSign());
			if (this.list.size() > i.list.size())
				loop = i.list.size();
			else
				loop = this.list.size();
			// System.out.println(loop);
			for (int j = 1; j <= loop; j++) {
				add = ob1.getValue() + ob2.getValue() + carry;
				carry = 0;
				if (UtilityOperations.overflow(add) != 0)
					carry = 1;
				p.list.insertLast(UtilityOperations.underflow(add));
				// System.out.println("Inside for loop");
				if (j != loop) {
					// System.out.println("Inside if loop");
					ob1 = this.list.after(ob1);
					ob2 = i.list.after(ob2);
				}
			}
			// if(this.getDigitCount()>i.getDigitCount())loop=this.list.size()-loop;
			if (this.list.size() != i.list.size()) {
				if (this.getDigitCount() > i.getDigitCount()) {
					loop = this.list.size() - loop;
					ob1 = this.list.after(ob1);
					for (int j = 1; j <= loop; j++) {
						add = ob1.getValue() + carry;
						carry = 0;
						if (UtilityOperations.overflow(add) != 0)
							carry = 1;
						p.list.insertLast(UtilityOperations.underflow(add));
						if (j != loop) {
							ob1 = this.list.after(ob1);
						}

					}
					if (carry == 1)
						p.list.insertLast(UtilityOperations.underflow(carry));
				} else {
					loop = i.list.size() - loop;
					// System.out.println("this is add :"+loop);
					ob2 = i.list.after(ob2);
					for (int j = 1; j <= loop; j++) {

						add = ob2.getValue() + carry;
						// System.out.println("this is add :"+add);
						carry = 0;
						if (UtilityOperations.overflow(add) != 0)
							carry = 1;
						p.list.insertLast(UtilityOperations.underflow(add));
						if (j != loop) {
							ob2 = i.list.after(ob2);
						}

					}
					if (carry == 1)
						p.list.insertLast(UtilityOperations.underflow(carry));

				}

			} else if (carry == 1)
				p.list.insertLast(carry);

		} else {
			i.sign = !i.getSign();
			// System.out.println("this is the i in addition sign :
			// "+i.getSign());
			p = this.subtract(i);
			i.sign = !i.getSign();
		}

		return p;

	}

	@SuppressWarnings("unchecked")
	public LongInteger subtract(LongInteger i) {
		int loop;
		int sub = 0;
		int borrow = 0;
		int swap = 0;
		LongInteger p = new LongInteger();
		if ((!this.getSign() && i.getSign()) || (this.getSign() && !i.getSign())) {
			i.sign = !i.getSign();
			// System.out.println("this is the i sign : "+i.getSign());
			// System.out.println("this is before the add call");
			p = this.add(i);
		} else {

			if (this.getDigitCount() == i.getDigitCount()) {
				// System.out.println("this is same digit count");
				// System.out.println("the sign of this and i: "+this.getSign()
				// +" " +i.getSign());
				if (this.lessThan(i))
					p.setSign();
				// System.out.println("this is this less than i: "
				// +this.lessThan(i));

			}
			// System.out.println("this should be seen");
			i.sign = !i.getSign();
			if (this.getDigitCount() != i.getDigitCount()) {
				if (this.getDigitCount() > i.getDigitCount()) {
					// System.out.println("this should not be seen");
					if (this.getSign())
						p.setSign();
				} else {
					// System.out.println("this should be seen");
					if (i.getSign())
						p.setSign();

				}
			}
			if (this.list.size() > i.list.size())
				loop = i.list.size();
			else
				loop = this.list.size();
			if (this.getDigitCount() < i.getDigitCount()) {
				LongInteger obj = new LongInteger();
				obj.list = this.list;
				this.list = i.list;
				i.list = obj.list;
				swap = 1;
			} else if (this.getDigitCount() == i.getDigitCount()) {
				if (this.greaterThan(i)) {
					LongInteger obj = new LongInteger();
					obj.list = this.list;
					this.list = i.list;
					i.list = obj.list;
					swap = 1;
				}
			}

			Position ob1 = this.list.first();
			Position ob2 = i.list.first();
			for (int j = 1; j <= loop; j++) {
				// System.out.println("this is inside for loop");
				// System.out.println("this is 1 & 2: "+ob1.getValue()+" "
				// +ob2.getValue());
				// System.out.println("this is borrow: "+borrow);
				if (ob1.getValue() < ob2.getValue() && !this.list.isLast(ob1)) {
					// System.out.println("this is inside if-1");
					// System.out.println("this is borrow: "+borrow);

					if (borrow == 1) {
						// System.out.println("this is inside if-3");
						sub = (ob1.getValue() - 1) + 10000;
						// System.out.println("This is sub - 2: "+sub);
						borrow = 1;
					}

					if (borrow == 0) {

						// System.out.println("this is inside if-2");
						sub = ob1.getValue() + 10000;
						// System.out.println("This is sub -1: "+sub);
						borrow = 1;
					}
				} else {
					if (borrow == 1) {
						sub = (ob1.getValue() - 1) + 10000;
						// System.out.println("This is sub - 2: "+sub);

					} else
						sub = ob1.getValue();
					borrow = 0;
				}
				sub = sub - ob2.getValue();
				// System.out.println("this is subtracted value: "+sub);
				// System.out.println("This value is inserted with utility:
				// "+UtilityOperations.underflow(sub));
				p.list.insertLast(UtilityOperations.underflow(sub));
				if (j != loop) {
					// System.out.println("this should not be seen");
					ob1 = this.list.after(ob1);
					ob2 = i.list.after(ob2);
				}
			}
			if (this.list.size() != i.list.size()) {
				if (this.getDigitCount() > i.getDigitCount()) {
					loop = this.list.size() - loop;
					ob1 = this.list.after(ob1);

					for (int j = 1; j <= loop; j++) {
						if (borrow == 1) {
							// System.out.println("this is inside borrow");
							// System.out.println("this is last term:
							// "+ob1.getValue());

							sub = ob1.getValue() - 1;
							borrow = 0;
							// System.out.println("this is sub: "+sub);
						} else
							sub = ob1.getValue();
						// System.out.println("this is sub: "+sub);
						p.list.insertLast(UtilityOperations.underflow(sub));
						if (j != loop) {
							ob1 = this.list.after(ob1);
						}

					}
				} else {
					loop = i.list.size() - loop;
					ob2 = i.list.after(ob2);
					for (int j = 1; j <= loop; j++) {
						p.list.insertLast(UtilityOperations.underflow(ob2.getValue()));
						if (j != loop) {
							ob2 = i.list.after(ob2);
						}

					}

				}
			}
		}
		// System.out.println("this is 2ND last line before return and the sign
		// of B is :"+i.getSign());

		if (swap == 1) {
			LongInteger obj = new LongInteger();
			obj.list = this.list;
			this.list = i.list;
			i.list = obj.list;
			swap = 0;

		}
		i.sign = !i.getSign();

		// System.out.println("this is first value:
		// "+p.list.first().getValue());
		// System.out.println("this is first value: "+p.list.last().getValue());
		return p;
	}

	@SuppressWarnings("unchecked")
	public LongInteger multiply(LongInteger i) {
		int swap = 0;
		LongInteger p = new LongInteger();
		if (this.getSign() != i.getSign())
			p.setSign();
		if (this.getDigitCount() < i.getDigitCount()) {
			LongInteger obj = new LongInteger();
			obj.list = this.list;
			this.list = i.list;
			i.list = obj.list;
			swap = 1;
		}
		Position ob1 = this.list.first();
		Position ob2 = i.list.first();
		Position temp = ob1;
		Position temp1 = ob2;
		int overflow = 0;
		int overflow2 = 0;
		int underflow = 0;
		int product = 0;
		int max = this.list.size() + i.list.size();
		int prevoverflow = 0;
		for (int x = 1; x <= max - 1; x++) {
			for (int y = 1; y <= x; y++) {
				// System.out.println(y);
				product = ob1.getValue() * ob2.getValue();
				// System.out.println(product);
				overflow = overflow + UtilityOperations.overflow(product);
				underflow = underflow + UtilityOperations.underflow(product);
				// System.out.println("this is y"+y);
				if (!i.list.isLast(ob2)) {
					// System.out.println("-------"+x);
					ob1 = this.list.before(ob1);
					ob2 = i.list.after(ob2);
					// System.out.println("-------");
				} else {

					y = x + 1;
					// System.out.println("the value of y & x: "+y +" " +x);
				}
			}
			if (!this.list.isLast(temp)) {

				// System.out.println("count this");
				// System.out.println("this is value temp and ob1 value:
				// "+temp.getValue()+" " +ob1.getValue());
				ob2 = i.list.first();
				ob1 = this.list.after(temp);
				temp = ob1;

			} else {
				// System.out.println("this should get print");
				// System.out.println("this should be print for one time the
				// temp1 and the temp is "+temp1.getValue()+" "
				// +temp.getValue());
				if (i.list.isLast(temp1)) {

					// System.out.println("this should not print");

					x = max + 1;
				} else {
					// System.out.println("this is temp1: "+temp1.getValue());
					// System.out.println("this is ob2 : "+ob2.getValue());
					ob2 = i.list.after(temp1);
					temp1 = ob2;
					ob1 = temp;
				}
			}

			// System.out.println("final sum: "+overflow+underflow);
			underflow = prevoverflow + underflow;
			// System.out.println("this is underflow: "+underflow);
			// System.out.println("This is the node by node value:
			// "+UtilityOperations.underflow(underflow));
			p.list.insertLast(UtilityOperations.underflow(underflow));
			overflow2 = overflow + UtilityOperations.overflow(underflow);
			// System.out.println("this is overflow: "+overflow2);
			prevoverflow = overflow2;
			overflow = 0;
			underflow = 0;
			overflow2 = 0;

		}
		while (prevoverflow > 0) {
			p.list.insertLast(UtilityOperations.underflow(prevoverflow));
			prevoverflow = prevoverflow / 10000;

		}
		// System.out.println("This is digit count: "+p.getDigitCount());
		/// System.out.println(prevoverflow);
		if (swap == 1) {
			LongInteger obj = new LongInteger();
			obj.list = this.list;
			this.list = i.list;
			i.list = obj.list;
			swap = 0;
		}

		return p;
	}

	public LongInteger power(int p) {
		LongInteger ob = new LongInteger();
		// LongInteger ob1 = new LongInteger();
		if (p % 2 != 0 && this.getSign())
			ob.setSign();

		if (p >= 5) {
			ob = this.multiply(this);
			ob = ob.multiply(ob);
			ob = ob.multiply(this);

		}
		if (p >= 10) {

			ob = ob.multiply(ob);

			if (p == 20) {

				ob = ob.multiply(ob);

			}
			if (p == 30) {

				ob = ob.multiply(ob).multiply(ob);
				// ob =
				// ob.multiply(((this.multiply(this)).multiply(this.multiply(this))).multiply(this));
			}
		}

		return ob;

	}

}
