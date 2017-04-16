package com.dsa.main;

import com.dsa.calculator.LongInteger;
import com.dsa.model.UtilityOperations;

public class finaltest {
	public static void main(String args[]) {

		/**
		 * SLL Runtime
		 * 
		 * 
		 * 
		 * Step 1 :
		 * 
		 * 
		 * 
		 * Initialization Running Time
		 * 
		 * A's Initialization Running Time : 790 B's Initialization Running Time
		 * : 20543 C's Initialization Running Time : 25284 D's Initialization
		 * Running Time : 47407 E's Initialization Running Time : 122074 F's
		 * Initialization Running Time : 52543 G's Initialization Running Time :
		 * 124049 H's Initialization Running Time : 111012 I's Initialization
		 * Running Time : 319999
		 * 
		 * 
		 * 
		 * 
		 * Output Running Time
		 * 
		 * A's output running time is : 49778 B's output running time is : 39506
		 * C's output running time is : 39902 D's output running time is : 58074
		 * E's output running time is : 187259 F's output running time is :
		 * 75852 G's output running time is : 198321 H's output running time is
		 * : 184493 I's output running time is : 623801
		 * 
		 * 
		 * Traverse Running Time
		 * 
		 * A's traverse running time is : 50172 B's traverse running time is :
		 * 35160 C's traverse running time is : 40296 D's traverse running time
		 * is : 68346 E's traverse running time is : 131555 F's traverse running
		 * time is : 70321 G's traverse running time is : 315259 H's traverse
		 * running time is : 209383 I's traverse running time is : 680295
		 * 
		 * 
		 * Number of Digit Running Time
		 * 
		 * A's digit count running time is : 386765 B's digit count running time
		 * is : 20543 C's digit count running time is : 19358 D's digit count
		 * running time is : 18568 E's digit count running time is : 20543 F's
		 * digit count running time is : 18963 G's digit count running time is :
		 * 18963 H's digit count running time is : 18568 I's digit count running
		 * time is : 23703
		 * 
		 * 
		 * Utilities Operation running time
		 * 
		 * The Utilities Operations Running time is: 446814
		 * 
		 * 
		 * Comparisons (=, <, >) Running Times
		 * 
		 * Comparisons of List A starts from here: A=A Running Time : 476839 A<A
		 * Running Time : 4741 A>A Running Time : 3161
		 * 
		 * Comparisons of List A starts from here: A=B Running Time : 1976 A<B
		 * Running Time : 3160 A>B Running Time : 2765
		 * 
		 * Comparisons of List A starts from here: A=C Running Time : 791 A<C
		 * Running Time : 790 A>C Running Time : 790
		 * 
		 * Comparisons of List A starts from here: A=D Running Time : 1976 A<D
		 * Running Time : 3555 A>D Running Time : 3161
		 * 
		 * Comparisons of List A starts from here: A=E Running Time : 2371 A<E
		 * Running Time : 3950 A>E Running Time : 3951
		 * 
		 * Comparisons of List A starts from here: A=F Running Time : 395 A<F
		 * Running Time : 791 A>F Running Time : 790
		 * 
		 * Comparisons of List A starts from here: A=G Running Time : 3951 A<G
		 * Running Time : 5136 A>G Running Time : 5531
		 * 
		 * Comparisons of List A starts from here: A=H Running Time : 790 A<H
		 * Running Time : 395 A>H Running Time : 395
		 * 
		 * Comparisons of List A starts from here: A=I Running Time : 5531 A<I
		 * Running Time : 9482 A>I Running Time : 9481
		 * 
		 * Comparisons of List B starts from here: B=A Running Time : 1976 B<A
		 * Running Time : 2370 B>A Running Time : 2371
		 * 
		 * Comparisons of List B starts from here: B=B Running Time : 5926 B<B
		 * Running Time : 3161 B>B Running Time : 2370
		 * 
		 * Comparisons of List B starts from here: B=C Running Time : 790 B<C
		 * Running Time : 790 B>C Running Time : 395
		 * 
		 * Comparisons of List B starts from here: B=D Running Time : 2371 B<D
		 * Running Time : 3160 B>D Running Time : 3161
		 * 
		 * Comparisons of List B starts from here: B=E Running Time : 2371 B<E
		 * Running Time : 4345 B>E Running Time : 3951
		 * 
		 * Comparisons of List B starts from here: B=F Running Time : 790 B<F
		 * Running Time : 790 B>F Running Time : 395
		 * 
		 * Comparisons of List B starts from here: B=G Running Time : 2766 B<G
		 * Running Time : 5136 B>G Running Time : 5136
		 * 
		 * Comparisons of List B starts from here: B=H Running Time : 790 B<H
		 * Running Time : 790 B>H Running Time : 791
		 * 
		 * Comparisons of List B starts from here: B=I Running Time : 4346 B<I
		 * Running Time : 9481 B>I Running Time : 9087
		 * 
		 * Comparisons of List C starts from here: C=A Running Time : 790 C<A
		 * Running Time : 395 C>A Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=B Running Time : 791 C<B
		 * Running Time : 790 C>B Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=C Running Time : 3950 C<C
		 * Running Time : 3556 C>C Running Time : 3161
		 * 
		 * Comparisons of List C starts from here: C=D Running Time : 395 C<D
		 * Running Time : 395 C>D Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=E Running Time : 790 C<E
		 * Running Time : 395 C>E Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=F Running Time : 2370 C<F
		 * Running Time : 3556 C>F Running Time : 3555
		 * 
		 * Comparisons of List C starts from here: C=G Running Time : 395 C<G
		 * Running Time : 395 C>G Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=H Running Time : 3556 C<H
		 * Running Time : 5530 C>H Running Time : 4740
		 * 
		 * Comparisons of List C starts from here: C=I Running Time : 395 C<I
		 * Running Time : 395 C>I Running Time : 395
		 * 
		 * Comparisons of List D starts from here: D=A Running Time : 3556 D<A
		 * Running Time : 2765 D>A Running Time : 2766
		 * 
		 * Comparisons of List D starts from here: D=B Running Time : 1976 D<B
		 * Running Time : 2765 D>B Running Time : 3160
		 * 
		 * Comparisons of List D starts from here: D=C Running Time : 395 D<C
		 * Running Time : 395 D>C Running Time : 790
		 * 
		 * Comparisons of List D starts from here: D=D Running Time : 4740 D<D
		 * Running Time : 4741 D>D Running Time : 4740
		 * 
		 * Comparisons of List D starts from here: D=E Running Time : 2766 D<E
		 * Running Time : 4741 D>E Running Time : 4346
		 * 
		 * Comparisons of List D starts from here: D=F Running Time : 790 D<F
		 * Running Time : 790 D>F Running Time : 790
		 * 
		 * Comparisons of List D starts from here: D=G Running Time : 3160 D<G
		 * Running Time : 5531 D>G Running Time : 5531
		 * 
		 * Comparisons of List D starts from here: D=H Running Time : 790 D<H
		 * Running Time : 790 D>H Running Time : 790
		 * 
		 * Comparisons of List D starts from here: D=I Running Time : 4346 D<I
		 * Running Time : 9877 D>I Running Time : 9481
		 * 
		 * Comparisons of List E starts from here: E=A Running Time : 2371 E<A
		 * Running Time : 3160 E>A Running Time : 22519
		 * 
		 * Comparisons of List E starts from here: E=B Running Time : 2370 E<B
		 * Running Time : 3161 E>B Running Time : 3160
		 * 
		 * Comparisons of List E starts from here: E=C Running Time : 790 E<C
		 * Running Time : 790 E>C Running Time : 790
		 * 
		 * Comparisons of List E starts from here: E=D Running Time : 2766 E<D
		 * Running Time : 3556 E>D Running Time : 3555
		 * 
		 * Comparisons of List E starts from here: E=E Running Time : 11062 E<E
		 * Running Time : 11457 E>E Running Time : 24494
		 * 
		 * Comparisons of List E starts from here: E=F Running Time : 395 E<F
		 * Running Time : 790 E>F Running Time : 395
		 * 
		 * Comparisons of List E starts from here: E=G Running Time : 3160 E<G
		 * Running Time : 6716 E>G Running Time : 5926
		 * 
		 * Comparisons of List E starts from here: E=H Running Time : 790 E<H
		 * Running Time : 396 E>H Running Time : 395
		 * 
		 * Comparisons of List E starts from here: E=I Running Time : 4740 E<I
		 * Running Time : 21729 E>I Running Time : 11457
		 * 
		 * Comparisons of List F starts from here: F=A Running Time : 790 F<A
		 * Running Time : 790 F>A Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=B Running Time : 395 F<B
		 * Running Time : 790 F>B Running Time : 395
		 * 
		 * Comparisons of List F starts from here: F=C Running Time : 2765 F<C
		 * Running Time : 17383 F>C Running Time : 2766
		 * 
		 * Comparisons of List F starts from here: F=D Running Time : 395 F<D
		 * Running Time : 395 F>D Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=E Running Time : 790 F<E
		 * Running Time : 790 F>E Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=F Running Time : 5925 F<F
		 * Running Time : 5531 F>F Running Time : 5136
		 * 
		 * Comparisons of List F starts from here: F=G Running Time : 790 F<G
		 * Running Time : 790 F>G Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=H Running Time : 3951 F<H
		 * Running Time : 5926 F>H Running Time : 5531
		 * 
		 * Comparisons of List F starts from here: F=I Running Time : 395 F<I
		 * Running Time : 395 F>I Running Time : 791
		 * 
		 * Comparisons of List G starts from here: G=A Running Time : 3161 G<A
		 * Running Time : 4346 G>A Running Time : 3951
		 * 
		 * Comparisons of List G starts from here: G=B Running Time : 2765 G<B
		 * Running Time : 4346 G>B Running Time : 3951
		 * 
		 * Comparisons of List G starts from here: G=C Running Time : 790 G<C
		 * Running Time : 395 G>C Running Time : 790
		 * 
		 * Comparisons of List G starts from here: G=D Running Time : 3161 G<D
		 * Running Time : 4741 G>D Running Time : 4346
		 * 
		 * Comparisons of List G starts from here: G=E Running Time : 3160 G<E
		 * Running Time : 5136 G>E Running Time : 4741
		 * 
		 * Comparisons of List G starts from here: G=F Running Time : 790 G<F
		 * Running Time : 395 G>F Running Time : 396
		 * 
		 * Comparisons of List G starts from here: G=G Running Time : 63605 G<G
		 * Running Time : 55308 G>G Running Time : 39506
		 * 
		 * Comparisons of List G starts from here: G=H Running Time : 790 G<H
		 * Running Time : 790 G>H Running Time : 790
		 * 
		 * Comparisons of List G starts from here: G=I Running Time : 5531 G<I
		 * Running Time : 12642 G>I Running Time : 26469
		 * 
		 * Comparisons of List H starts from here: H=A Running Time : 790 H<A
		 * Running Time : 790 H>A Running Time : 790
		 * 
		 * Comparisons of List H starts from here: H=B Running Time : 790 H<B
		 * Running Time : 396 H>B Running Time : 790
		 * 
		 * Comparisons of List H starts from here: H=C Running Time : 3556 H<C
		 * Running Time : 4346 H>C Running Time : 4346
		 * 
		 * Comparisons of List H starts from here: H=D Running Time : 395 H<D
		 * Running Time : 790 H>D Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=E Running Time : 395 H<E
		 * Running Time : 395 H>E Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=F Running Time : 4741 H<F
		 * Running Time : 3951 H>F Running Time : 3556
		 * 
		 * Comparisons of List H starts from here: H=G Running Time : 395 H<G
		 * Running Time : 395 H>G Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=H Running Time : 22518 H<H
		 * Running Time : 24493 H>H Running Time : 16592
		 * 
		 * Comparisons of List H starts from here: H=I Running Time : 790 H<I
		 * Running Time : 395 H>I Running Time : 790
		 * 
		 * Comparisons of List I starts from here: I=A Running Time : 4346 I<A
		 * Running Time : 5926 I>A Running Time : 5925
		 * 
		 * Comparisons of List I starts from here: I=B Running Time : 3555 I<B
		 * Running Time : 5531 I>B Running Time : 5531
		 * 
		 * Comparisons of List I starts from here: I=C Running Time : 395 I<C
		 * Running Time : 791 I>C Running Time : 790
		 * 
		 * Comparisons of List I starts from here: I=D Running Time : 3951 I<D
		 * Running Time : 5531 I>D Running Time : 5926
		 * 
		 * Comparisons of List I starts from here: I=E Running Time : 3950 I<E
		 * Running Time : 6321 I>E Running Time : 5926
		 * 
		 * Comparisons of List I starts from here: I=F Running Time : 790 I<F
		 * Running Time : 791 I>F Running Time : 395
		 * 
		 * Comparisons of List I starts from here: I=G Running Time : 4346 I<G
		 * Running Time : 6716 I>G Running Time : 20938
		 * 
		 * Comparisons of List I starts from here: I=H Running Time : 790 I<H
		 * Running Time : 790 I>H Running Time : 1580
		 * 
		 * Comparisons of List I starts from here: I=I Running Time : 158815 I<I
		 * Running Time : 129580 I>I Running Time : 111407
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Step 2 :
		 * 
		 * Addition Running Time
		 * 
		 * 
		 * A + A Running Time : 356345
		 * 
		 * A + B Running Time : 12246
		 * 
		 * A + C Running Time : 11852
		 * 
		 * A + D Running Time : 7111
		 * 
		 * A + E Running Time : 12642
		 * 
		 * A + F Running Time : 11852
		 * 
		 * A + G Running Time : 23703
		 * 
		 * A + H Running Time : 26074
		 * 
		 * A + I Running Time : 92839
		 * 
		 * B + A Running Time : 5531
		 * 
		 * B + B Running Time : 4345
		 * 
		 * B + C Running Time : 13432
		 * 
		 * B + D Running Time : 7506
		 * 
		 * B + E Running Time : 13827
		 * 
		 * B + F Running Time : 13827
		 * 
		 * B + G Running Time : 23308
		 * 
		 * B + H Running Time : 26864
		 * 
		 * B + I Running Time : 105481
		 * 
		 * C + A Running Time : 10272
		 * 
		 * C + B Running Time : 10666
		 * 
		 * C + C Running Time : 5136
		 * 
		 * C + D Running Time : 12247
		 * 
		 * C + E Running Time : 39901
		 * 
		 * C + F Running Time : 8691
		 * 
		 * C + G Running Time : 30419
		 * 
		 * C + H Running Time : 22124
		 * 
		 * C + I Running Time : 104691
		 * 
		 * D + A Running Time : 7111
		 * 
		 * D + B Running Time : 7111
		 * 
		 * D + C Running Time : 11852
		 * 
		 * D + D Running Time : 6321
		 * 
		 * D + E Running Time : 15012
		 * 
		 * D + F Running Time : 13827
		 * 
		 * D + G Running Time : 25284
		 * 
		 * D + H Running Time : 29630
		 * 
		 * D + I Running Time : 122469
		 * 
		 * E + A Running Time : 27654
		 * 
		 * E + B Running Time : 28049
		 * 
		 * E + C Running Time : 19358
		 * 
		 * E + D Running Time : 15803
		 * 
		 * E + E Running Time : 16198
		 * 
		 * E + F Running Time : 22518
		 * 
		 * E + G Running Time : 32395
		 * 
		 * E + H Running Time : 37926
		 * 
		 * E + I Running Time : 120888
		 * 
		 * F + A Running Time : 11852
		 * 
		 * F + B Running Time : 14617
		 * 
		 * F + C Running Time : 8296
		 * 
		 * F + D Running Time : 13827
		 * 
		 * F + E Running Time : 20543
		 * 
		 * F + F Running Time : 8296
		 * 
		 * F + G Running Time : 33580
		 * 
		 * F + H Running Time : 24494
		 * 
		 * F + I Running Time : 174617
		 * 
		 * G + A Running Time : 38320
		 * 
		 * G + B Running Time : 26074
		 * 
		 * G + C Running Time : 31605
		 * 
		 * G + D Running Time : 25679
		 * 
		 * G + E Running Time : 31210
		 * 
		 * G + F Running Time : 33975
		 * 
		 * G + G Running Time : 35555
		 * 
		 * G + H Running Time : 49778
		 * 
		 * G + I Running Time : 122074
		 * 
		 * H + A Running Time : 39111
		 * 
		 * H + B Running Time : 42272
		 * 
		 * H + C Running Time : 37926
		 * 
		 * H + D Running Time : 82173
		 * 
		 * H + E Running Time : 69925
		 * 
		 * H + F Running Time : 34370
		 * 
		 * H + G Running Time : 116148
		 * 
		 * H + H Running Time : 61629
		 * 
		 * H + I Running Time : 143802
		 * 
		 * I + A Running Time : 115753
		 * 
		 * I + B Running Time : 157629
		 * 
		 * I + C Running Time : 126025
		 * 
		 * I + D Running Time : 124049
		 * 
		 * I + E Running Time : 33975
		 * 
		 * I + F Running Time : 39901
		 * 
		 * I + G Running Time : 34766
		 * 
		 * I + H Running Time : 44642
		 * 
		 * I + I Running Time : 34765
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Subtraction Running Time
		 * 
		 * 
		 * A - A Running Time : 374518
		 * 
		 * A - B Running Time : 15013
		 * 
		 * A - C Running Time : 9481
		 * 
		 * A - D Running Time : 11457
		 * 
		 * A - E Running Time : 15803
		 * 
		 * A - F Running Time : 7901
		 * 
		 * A - G Running Time : 27654
		 * 
		 * A - H Running Time : 20938
		 * 
		 * A - I Running Time : 97186
		 * 
		 * B - A Running Time : 7901
		 * 
		 * B - B Running Time : 11852
		 * 
		 * B - C Running Time : 6321
		 * 
		 * B - D Running Time : 14222
		 * 
		 * B - E Running Time : 17383
		 * 
		 * B - F Running Time : 8691
		 * 
		 * B - G Running Time : 28050
		 * 
		 * B - H Running Time : 20939
		 * 
		 * B - I Running Time : 128000
		 * 
		 * C - A Running Time : 7506
		 * 
		 * C - B Running Time : 7111
		 * 
		 * C - C Running Time : 13037
		 * 
		 * C - D Running Time : 8296
		 * 
		 * C - E Running Time : 13432
		 * 
		 * C - F Running Time : 11852
		 * 
		 * C - G Running Time : 53333
		 * 
		 * C - H Running Time : 41481
		 * 
		 * C - I Running Time : 110222
		 * 
		 * D - A Running Time : 10666
		 * 
		 * D - B Running Time : 25284
		 * 
		 * D - C Running Time : 8297
		 * 
		 * D - D Running Time : 16593
		 * 
		 * D - E Running Time : 19358
		 * 
		 * D - F Running Time : 9481
		 * 
		 * D - G Running Time : 35555
		 * 
		 * D - H Running Time : 23704
		 * 
		 * D - I Running Time : 118914
		 * 
		 * E - A Running Time : 40692
		 * 
		 * E - B Running Time : 18568
		 * 
		 * E - C Running Time : 14222
		 * 
		 * E - D Running Time : 33975
		 * 
		 * E - E Running Time : 54518
		 * 
		 * E - F Running Time : 15407
		 * 
		 * E - G Running Time : 51753
		 * 
		 * E - H Running Time : 28839
		 * 
		 * E - I Running Time : 132346
		 * 
		 * F - A Running Time : 24888
		 * 
		 * F - B Running Time : 8692
		 * 
		 * F - C Running Time : 13037
		 * 
		 * F - D Running Time : 23309
		 * 
		 * F - E Running Time : 15408
		 * 
		 * F - F Running Time : 22913
		 * 
		 * F - G Running Time : 62814
		 * 
		 * F - H Running Time : 45827
		 * 
		 * F - I Running Time : 109037
		 * 
		 * G - A Running Time : 29235
		 * 
		 * G - B Running Time : 31605
		 * 
		 * G - C Running Time : 38716
		 * 
		 * G - D Running Time : 32000
		 * 
		 * G - E Running Time : 38321
		 * 
		 * G - F Running Time : 26074
		 * 
		 * G - G Running Time : 94420
		 * 
		 * G - H Running Time : 38321
		 * 
		 * G - I Running Time : 173431
		 * 
		 * H - A Running Time : 36345
		 * 
		 * H - B Running Time : 61235
		 * 
		 * H - C Running Time : 37135
		 * 
		 * H - D Running Time : 32790
		 * 
		 * H - E Running Time : 40296
		 * 
		 * H - F Running Time : 39506
		 * 
		 * H - G Running Time : 69135
		 * 
		 * H - H Running Time : 114963
		 * 
		 * H - I Running Time : 153679
		 * 
		 * I - A Running Time : 144592
		 * 
		 * I - B Running Time : 95605
		 * 
		 * I - C Running Time : 65975
		 * 
		 * I - D Running Time : 37926
		 * 
		 * I - E Running Time : 44642
		 * 
		 * I - F Running Time : 31210
		 * 
		 * I - G Running Time : 41876
		 * 
		 * I - H Running Time : 26074
		 * 
		 * I - I Running Time : 199110
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Multiplication Running Time
		 * 
		 * 
		 * 
		 * A * A Running Time : 312889
		 * 
		 * A * B Running Time : 9481
		 * 
		 * A * C Running Time : 7901
		 * 
		 * A * D Running Time : 8691
		 * 
		 * A * E Running Time : 15408
		 * 
		 * A * F Running Time : 10272
		 * 
		 * A * G Running Time : 28049
		 * 
		 * A * H Running Time : 24888
		 * 
		 * A * I Running Time : 101926
		 * 
		 * B * A Running Time : 5531
		 * 
		 * B * B Running Time : 28839
		 * 
		 * B * C Running Time : 9877
		 * 
		 * B * D Running Time : 12247
		 * 
		 * B * E Running Time : 24889
		 * 
		 * B * F Running Time : 13037
		 * 
		 * B * G Running Time : 46222
		 * 
		 * B * H Running Time : 40296
		 * 
		 * B * I Running Time : 263111
		 * 
		 * C * A Running Time : 7111
		 * 
		 * C * B Running Time : 8691
		 * 
		 * C * C Running Time : 10667
		 * 
		 * C * D Running Time : 17778
		 * 
		 * C * E Running Time : 59654
		 * 
		 * C * F Running Time : 16593
		 * 
		 * C * G Running Time : 101531
		 * 
		 * C * H Running Time : 100741
		 * 
		 * C * I Running Time : 304593
		 * 
		 * D * A Running Time : 8691
		 * 
		 * D * B Running Time : 11852
		 * 
		 * D * C Running Time : 15012
		 * 
		 * D * D Running Time : 34766
		 * 
		 * D * E Running Time : 62815
		 * 
		 * D * F Running Time : 25284
		 * 
		 * D * G Running Time : 158419
		 * 
		 * D * H Running Time : 107061
		 * 
		 * D * I Running Time : 517530
		 * 
		 * E * A Running Time : 15803
		 * 
		 * E * B Running Time : 23308
		 * 
		 * E * C Running Time : 31210
		 * 
		 * E * D Running Time : 49382
		 * 
		 * E * E Running Time : 195160
		 * 
		 * E * F Running Time : 131160
		 * 
		 * E * G Running Time : 536098
		 * 
		 * E * H Running Time : 355555
		 * 
		 * E * I Running Time : 535703
		 * 
		 * F * A Running Time : 9482
		 * 
		 * F * B Running Time : 11061
		 * 
		 * F * C Running Time : 33185
		 * 
		 * F * D Running Time : 18567
		 * 
		 * F * E Running Time : 45828
		 * 
		 * F * F Running Time : 19753
		 * 
		 * F * G Running Time : 57284
		 * 
		 * F * H Running Time : 48987
		 * 
		 * F * I Running Time : 132346
		 * 
		 * G * A Running Time : 18963
		 * 
		 * G * B Running Time : 26074
		 * 
		 * G * C Running Time : 32395
		 * 
		 * G * D Running Time : 69530
		 * 
		 * G * E Running Time : 143408
		 * 
		 * G * F Running Time : 108642
		 * 
		 * G * G Running Time : 175012
		 * 
		 * G * H Running Time : 216889
		 * 
		 * G * I Running Time : 453925
		 * 
		 * H * A Running Time : 16987
		 * 
		 * H * B Running Time : 22519
		 * 
		 * H * C Running Time : 28050
		 * 
		 * H * D Running Time : 39506
		 * 
		 * H * E Running Time : 79407
		 * 
		 * H * F Running Time : 45037
		 * 
		 * H * G Running Time : 144197
		 * 
		 * H * H Running Time : 129185
		 * 
		 * H * I Running Time : 493036
		 * 
		 * I * A Running Time : 77432
		 * 
		 * I * B Running Time : 52938
		 * 
		 * I * C Running Time : 64395
		 * 
		 * I * D Running Time : 102321
		 * 
		 * I * E Running Time : 235061
		 * 
		 * I * F Running Time : 100741
		 * 
		 * I * G Running Time : 366222
		 * 
		 * I * H Running Time : 295506
		 * 
		 * I * I Running Time : 830023
		 * 
		 * 
		 * 
		 * 
		 * Power Running Time
		 * 
		 * 
		 * 
		 * A's 5th power Running Time : 409283 A's 10th power Running Time :
		 * 32000 A's 20th power Running Time : 90864 A's 30th power Running Time
		 * : 222024
		 * 
		 * B's 5th power Running Time : 33581 B's 10th power Running Time :
		 * 109432 B's 20th power Running Time : 655407 B's 30th power Running
		 * Time : 2470317
		 * 
		 * C's 5th power Running Time : 218864 C's 10th power Running Time :
		 * 571653 C's 20th power Running Time : 715851 C's 30th power Running
		 * Time : 1212048
		 * 
		 * D's 5th power Running Time : 80198 D's 10th power Running Time :
		 * 551110 D's 20th power Running Time : 939060 D's 30th power Running
		 * Time : 1898664
		 * 
		 * E's 5th power Running Time : 268642 E's 10th power Running Time :
		 * 1235751 E's 20th power Running Time : 5658460 E's 30th power Running
		 * Time : 17204121
		 * 
		 * F's 5th power Running Time : 93234 F's 10th power Running Time :
		 * 96000 F's 20th power Running Time : 495011 F's 30th power Running
		 * Time : 1865874
		 * 
		 * G's 5th power Running Time : 440888 G's 10th power Running Time :
		 * 2590811 G's 20th power Running Time : 19931228 G's 30th power Running
		 * Time : 70831295
		 * 
		 * H's 5th power Running Time : 427851 H's 10th power Running Time :
		 * 1968985 H's 20th power Running Time : 14203237 H's 30th power Running
		 * Time : 51920906
		 * 
		 * I's 5th power Running Time : 5661621 I's 10th power Running Time :
		 * 42953019 I's 20th power Running Time : 343831556 I's 30th power
		 * Running Time : 1227584431
		 * 
		 * 
		 * 
		 * 
		 * 
		 * New Link List Running Time
		 * 
		 * J Running time is: 615900 K Running time is: 80592 L Running time is:
		 * 843851 M Running time is: 1161479 N Running time is: 197135 O Running
		 * time is: 165136 P Running time is: 90864 Q Running time is: 73086 R
		 * Running time is: 1336492 S Running time is: 123654 T Running time is:
		 * 94025 U Running time is: 113383 V Running time is: 99951 W Running
		 * time is: 250073 X Running time is: 967109 Y Running time is: 127209 Z
		 * Running time is: 1064690
		 * 
		 * 
		 * 
		 */

		/**
		 * Array LinkedList runtime
		 * 
		 * 
		 * 
		 * Step 1:
		 * 
		 * 
		 * Initialization Running Time
		 * 
		 * 
		 * A's Initialization Running Time : 790 B's Initialization Running Time
		 * : 34765 C's Initialization Running Time : 46617 D's Initialization
		 * Running Time : 56099 E's Initialization Running Time : 109037 F's
		 * Initialization Running Time : 41086 G's Initialization Running Time :
		 * 151703 H's Initialization Running Time : 116148 I's Initialization
		 * Running Time : 364641
		 * 
		 * 
		 * 
		 * Output Running Time
		 * 
		 * A's output running time is : 47408 B's output running time is : 39901
		 * C's output running time is : 36741 D's output running time is : 54519
		 * E's output running time is : 109037 F's output running time is :
		 * 65580 G's output running time is : 188049 H's output running time is
		 * : 168296 I's output running time is : 546764
		 * 
		 * 
		 * 
		 * 
		 * Traverse Running Time
		 * 
		 * A's traverse running time is : 48987 B's traverse running time is :
		 * 35160 C's traverse running time is : 41482 D's traverse running time
		 * is : 67555 E's traverse running time is : 129975 F's traverse running
		 * time is : 67950 G's traverse running time is : 225580 H's traverse
		 * running time is : 207802 I's traverse running time is : 577975
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Number of Digit Running Time
		 * 
		 * A's digit count running time is : 383209 B's digit count running time
		 * is : 20148 C's digit count running time is : 19753 D's digit count
		 * running time is : 32790 E's digit count running time is : 17777 F's
		 * digit count running time is : 18173 G's digit count running time is :
		 * 18173 H's digit count running time is : 17383 I's digit count running
		 * time is : 53333
		 * 
		 * 
		 * 
		 * 
		 * The Utilities Operations Running time is: 549135
		 * 
		 * 
		 * 
		 * 
		 * Comparisons (=, <, >) Running Times
		 * 
		 * Comparisons of List A starts from here: A=A Running Time : 516740 A<A
		 * Running Time : 6321 A>A Running Time : 3951
		 * 
		 * Comparisons of List A starts from here: A=B Running Time : 2371 A<B
		 * Running Time : 3160 A>B Running Time : 2370
		 * 
		 * Comparisons of List A starts from here: A=C Running Time : 395 A<C
		 * Running Time : 790 A>C Running Time : 395
		 * 
		 * Comparisons of List A starts from here: A=D Running Time : 1976 A<D
		 * Running Time : 2370 A>D Running Time : 2370
		 * 
		 * Comparisons of List A starts from here: A=E Running Time : 1580 A<E
		 * Running Time : 3161 A>E Running Time : 2370
		 * 
		 * Comparisons of List A starts from here: A=F Running Time : 790 A<F
		 * Running Time : 395 A>F Running Time : 790
		 * 
		 * Comparisons of List A starts from here: A=G Running Time : 16592 A<G
		 * Running Time : 2371 A>G Running Time : 2371
		 * 
		 * Comparisons of List A starts from here: A=H Running Time : 395 A<H
		 * Running Time : 790 A>H Running Time : 395
		 * 
		 * Comparisons of List A starts from here: A=I Running Time : 1976 A<I
		 * Running Time : 2765 A>I Running Time : 2370
		 * 
		 * Comparisons of List B starts from here: B=A Running Time : 1580 B<A
		 * Running Time : 1975 B>A Running Time : 1976
		 * 
		 * Comparisons of List B starts from here: B=B Running Time : 16988 B<B
		 * Running Time : 2766 B>B Running Time : 2370
		 * 
		 * Comparisons of List B starts from here: B=C Running Time : 790 B<C
		 * Running Time : 790 B>C Running Time : 790
		 * 
		 * Comparisons of List B starts from here: B=D Running Time : 1975 B<D
		 * Running Time : 2371 B>D Running Time : 1975
		 * 
		 * Comparisons of List B starts from here: B=E Running Time : 1580 B<E
		 * Running Time : 2370 B>E Running Time : 2371
		 * 
		 * Comparisons of List B starts from here: B=F Running Time : 395 B<F
		 * Running Time : 395 B>F Running Time : 790
		 * 
		 * Comparisons of List B starts from here: B=G Running Time : 1581 B<G
		 * Running Time : 2370 B>G Running Time : 1975
		 * 
		 * Comparisons of List B starts from here: B=H Running Time : 395 B<H
		 * Running Time : 790 B>H Running Time : 790
		 * 
		 * Comparisons of List B starts from here: B=I Running Time : 1975 B<I
		 * Running Time : 2370 B>I Running Time : 2371
		 * 
		 * Comparisons of List C starts from here: C=A Running Time : 395 C<A
		 * Running Time : 790 C>A Running Time : 395
		 * 
		 * Comparisons of List C starts from here: C=B Running Time : 790 C<B
		 * Running Time : 790 C>B Running Time : 396
		 * 
		 * Comparisons of List C starts from here: C=C Running Time : 3161 C<C
		 * Running Time : 2765 C>C Running Time : 2370
		 * 
		 * Comparisons of List C starts from here: C=D Running Time : 791 C<D
		 * Running Time : 791 C>D Running Time : 791
		 * 
		 * Comparisons of List C starts from here: C=E Running Time : 790 C<E
		 * Running Time : 395 C>E Running Time : 395
		 * 
		 * Comparisons of List C starts from here: C=F Running Time : 1975 C<F
		 * Running Time : 2371 C>F Running Time : 2370
		 * 
		 * Comparisons of List C starts from here: C=G Running Time : 791 C<G
		 * Running Time : 395 C>G Running Time : 790
		 * 
		 * Comparisons of List C starts from here: C=H Running Time : 1975 C<H
		 * Running Time : 2371 C>H Running Time : 1975
		 * 
		 * Comparisons of List C starts from here: C=I Running Time : 395 C<I
		 * Running Time : 790 C>I Running Time : 2370
		 * 
		 * Comparisons of List D starts from here: D=A Running Time : 2370 D<A
		 * Running Time : 1975 D>A Running Time : 1975
		 * 
		 * Comparisons of List D starts from here: D=B Running Time : 1581 D<B
		 * Running Time : 1975 D>B Running Time : 1976
		 * 
		 * Comparisons of List D starts from here: D=C Running Time : 395 D<C
		 * Running Time : 791 D>C Running Time : 791
		 * 
		 * Comparisons of List D starts from here: D=D Running Time : 3951 D<D
		 * Running Time : 3555 D>D Running Time : 3161
		 * 
		 * Comparisons of List D starts from here: D=E Running Time : 1976 D<E
		 * Running Time : 2370 D>E Running Time : 1975
		 * 
		 * Comparisons of List D starts from here: D=F Running Time : 395 D<F
		 * Running Time : 395 D>F Running Time : 395
		 * 
		 * Comparisons of List D starts from here: D=G Running Time : 1975 D<G
		 * Running Time : 2370 D>G Running Time : 1975
		 * 
		 * Comparisons of List D starts from here: D=H Running Time : 395 D<H
		 * Running Time : 790 D>H Running Time : 790
		 * 
		 * Comparisons of List D starts from here: D=I Running Time : 1581 D<I
		 * Running Time : 2370 D>I Running Time : 2370
		 * 
		 * Comparisons of List E starts from here: E=A Running Time : 1975 E<A
		 * Running Time : 1976 E>A Running Time : 1975
		 * 
		 * Comparisons of List E starts from here: E=B Running Time : 1580 E<B
		 * Running Time : 1975 E>B Running Time : 1975
		 * 
		 * Comparisons of List E starts from here: E=C Running Time : 395 E<C
		 * Running Time : 791 E>C Running Time : 790
		 * 
		 * Comparisons of List E starts from here: E=D Running Time : 1975 E<D
		 * Running Time : 1976 E>D Running Time : 1580
		 * 
		 * Comparisons of List E starts from here: E=E Running Time : 5531 E<E
		 * Running Time : 5531 E>E Running Time : 4741
		 * 
		 * Comparisons of List E starts from here: E=F Running Time : 395 E<F
		 * Running Time : 790 E>F Running Time : 790
		 * 
		 * Comparisons of List E starts from here: E=G Running Time : 1580 E<G
		 * Running Time : 1976 E>G Running Time : 1975
		 * 
		 * Comparisons of List E starts from here: E=H Running Time : 395 E<H
		 * Running Time : 395 E>H Running Time : 395
		 * 
		 * Comparisons of List E starts from here: E=I Running Time : 1975 E<I
		 * Running Time : 16593 E>I Running Time : 2371
		 * 
		 * Comparisons of List F starts from here: F=A Running Time : 790 F<A
		 * Running Time : 1185 F>A Running Time : 395
		 * 
		 * Comparisons of List F starts from here: F=B Running Time : 395 F<B
		 * Running Time : 395 F>B Running Time : 395
		 * 
		 * Comparisons of List F starts from here: F=C Running Time : 1976 F<C
		 * Running Time : 1975 F>C Running Time : 23704
		 * 
		 * Comparisons of List F starts from here: F=D Running Time : 790 F<D
		 * Running Time : 790 F>D Running Time : 396
		 * 
		 * Comparisons of List F starts from here: F=E Running Time : 395 F<E
		 * Running Time : 395 F>E Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=F Running Time : 3950 F<F
		 * Running Time : 3950 F>F Running Time : 3160
		 * 
		 * Comparisons of List F starts from here: F=G Running Time : 395 F<G
		 * Running Time : 790 F>G Running Time : 790
		 * 
		 * Comparisons of List F starts from here: F=H Running Time : 1976 F<H
		 * Running Time : 2370 F>H Running Time : 2371
		 * 
		 * Comparisons of List F starts from here: F=I Running Time : 395 F<I
		 * Running Time : 790 F>I Running Time : 790
		 * 
		 * Comparisons of List G starts from here: G=A Running Time : 1580 G<A
		 * Running Time : 2371 G>A Running Time : 1975
		 * 
		 * Comparisons of List G starts from here: G=B Running Time : 1581 G<B
		 * Running Time : 1975 G>B Running Time : 1976
		 * 
		 * Comparisons of List G starts from here: G=C Running Time : 790 G<C
		 * Running Time : 395 G>C Running Time : 790
		 * 
		 * Comparisons of List G starts from here: G=D Running Time : 1580 G<D
		 * Running Time : 1976 G>D Running Time : 1975
		 * 
		 * Comparisons of List G starts from here: G=E Running Time : 1580 G<E
		 * Running Time : 1976 G>E Running Time : 1580
		 * 
		 * Comparisons of List G starts from here: G=F Running Time : 790 G<F
		 * Running Time : 791 G>F Running Time : 790
		 * 
		 * Comparisons of List G starts from here: G=G Running Time : 22518 G<G
		 * Running Time : 7901 G>G Running Time : 6716
		 * 
		 * Comparisons of List G starts from here: G=H Running Time : 790 G<H
		 * Running Time : 790 G>H Running Time : 395
		 * 
		 * Comparisons of List G starts from here: G=I Running Time : 1975 G<I
		 * Running Time : 2765 G>I Running Time : 2371
		 * 
		 * Comparisons of List H starts from here: H=A Running Time : 395 H<A
		 * Running Time : 790 H>A Running Time : 14618
		 * 
		 * Comparisons of List H starts from here: H=B Running Time : 790 H<B
		 * Running Time : 790 H>B Running Time : 790
		 * 
		 * Comparisons of List H starts from here: H=C Running Time : 1580 H<C
		 * Running Time : 1976 H>C Running Time : 1975
		 * 
		 * Comparisons of List H starts from here: H=D Running Time : 395 H<D
		 * Running Time : 395 H>D Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=E Running Time : 790 H<E
		 * Running Time : 790 H>E Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=F Running Time : 1976 H<F
		 * Running Time : 1975 H>F Running Time : 1975
		 * 
		 * Comparisons of List H starts from here: H=G Running Time : 395 H<G
		 * Running Time : 790 H>G Running Time : 395
		 * 
		 * Comparisons of List H starts from here: H=H Running Time : 8296 H<H
		 * Running Time : 7506 H>H Running Time : 9876
		 * 
		 * Comparisons of List H starts from here: H=I Running Time : 395 H<I
		 * Running Time : 395 H>I Running Time : 395
		 * 
		 * Comparisons of List I starts from here: I=A Running Time : 1975 I<A
		 * Running Time : 1975 I>A Running Time : 1976
		 * 
		 * Comparisons of List I starts from here: I=B Running Time : 1975 I<B
		 * Running Time : 1976 I>B Running Time : 1975
		 * 
		 * Comparisons of List I starts from here: I=C Running Time : 395 I<C
		 * Running Time : 791 I>C Running Time : 790
		 * 
		 * Comparisons of List I starts from here: I=D Running Time : 1581 I<D
		 * Running Time : 1975 I>D Running Time : 2370
		 * 
		 * Comparisons of List I starts from here: I=E Running Time : 1580 I<E
		 * Running Time : 1975 I>E Running Time : 1976
		 * 
		 * Comparisons of List I starts from here: I=F Running Time : 790 I<F
		 * Running Time : 395 I>F Running Time : 790
		 * 
		 * Comparisons of List I starts from here: I=G Running Time : 1975 I<G
		 * Running Time : 2370 I>G Running Time : 1975
		 * 
		 * Comparisons of List I starts from here: I=H Running Time : 790 I<H
		 * Running Time : 395 I>H Running Time : 790
		 * 
		 * Comparisons of List I starts from here: I=I Running Time : 27654 I<I
		 * Running Time : 18568 I>I Running Time : 14618
		 * 
		 * 
		 * 
		 * 
		 * Step 2 :
		 * 
		 * Addition Running Time
		 * 
		 * 
		 * A + A Running Time : 301827
		 * 
		 * A + B Running Time : 18568
		 * 
		 * A + C Running Time : 11062
		 * 
		 * A + D Running Time : 5926
		 * 
		 * A + E Running Time : 8691
		 * 
		 * A + F Running Time : 9087
		 * 
		 * A + G Running Time : 13037
		 * 
		 * A + H Running Time : 13432
		 * 
		 * A + I Running Time : 24888
		 * 
		 * B + A Running Time : 4741
		 * 
		 * B + B Running Time : 3951
		 * 
		 * B + C Running Time : 11457
		 * 
		 * B + D Running Time : 6321
		 * 
		 * B + E Running Time : 10271
		 * 
		 * B + F Running Time : 9876
		 * 
		 * B + G Running Time : 12642
		 * 
		 * B + H Running Time : 13827
		 * 
		 * B + I Running Time : 24889
		 * 
		 * C + A Running Time : 8296
		 * 
		 * C + B Running Time : 8691
		 * 
		 * C + C Running Time : 4345
		 * 
		 * C + D Running Time : 9087
		 * 
		 * C + E Running Time : 12247
		 * 
		 * C + F Running Time : 5926
		 * 
		 * C + G Running Time : 15012
		 * 
		 * C + H Running Time : 12247
		 * 
		 * C + I Running Time : 24494
		 * 
		 * D + A Running Time : 6321
		 * 
		 * D + B Running Time : 5531
		 * 
		 * D + C Running Time : 9482
		 * 
		 * D + D Running Time : 5136
		 * 
		 * D + E Running Time : 9086
		 * 
		 * D + F Running Time : 10272
		 * 
		 * D + G Running Time : 12642
		 * 
		 * D + H Running Time : 14222
		 * 
		 * D + I Running Time : 26469
		 * 
		 * E + A Running Time : 7901
		 * 
		 * E + B Running Time : 9087
		 * 
		 * E + C Running Time : 11457
		 * 
		 * E + D Running Time : 8691
		 * 
		 * E + E Running Time : 8692
		 * 
		 * E + F Running Time : 13037
		 * 
		 * E + G Running Time : 13432
		 * 
		 * E + H Running Time : 16198
		 * 
		 * E + I Running Time : 25679
		 * 
		 * F + A Running Time : 8296
		 * 
		 * F + B Running Time : 9481
		 * 
		 * F + C Running Time : 5926
		 * 
		 * F + D Running Time : 9087
		 * 
		 * F + E Running Time : 12247
		 * 
		 * F + F Running Time : 5531
		 * 
		 * F + G Running Time : 16593
		 * 
		 * F + H Running Time : 11457
		 * 
		 * F + I Running Time : 25679
		 * 
		 * G + A Running Time : 31605
		 * 
		 * G + B Running Time : 40297
		 * 
		 * G + C Running Time : 14223
		 * 
		 * G + D Running Time : 12247
		 * 
		 * G + E Running Time : 13827
		 * 
		 * G + F Running Time : 15408
		 * 
		 * G + G Running Time : 14618
		 * 
		 * G + H Running Time : 18173
		 * 
		 * G + I Running Time : 26864
		 * 
		 * H + A Running Time : 13037
		 * 
		 * H + B Running Time : 13432
		 * 
		 * H + C Running Time : 11852
		 * 
		 * H + D Running Time : 14222
		 * 
		 * H + E Running Time : 15012
		 * 
		 * H + F Running Time : 12247
		 * 
		 * H + G Running Time : 18568
		 * 
		 * H + H Running Time : 12247
		 * 
		 * H + I Running Time : 29235
		 * 
		 * I + A Running Time : 24099
		 * 
		 * I + B Running Time : 24098
		 * 
		 * I + C Running Time : 23308
		 * 
		 * I + D Running Time : 24494
		 * 
		 * I + E Running Time : 54519
		 * 
		 * I + F Running Time : 62420
		 * 
		 * I + G Running Time : 26469
		 * 
		 * I + H Running Time : 28840
		 * 
		 * I + I Running Time : 30420
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Subtraction Running Time
		 * 
		 * 
		 * 
		 * A - A Running Time : 487505
		 * 
		 * A - B Running Time : 11457
		 * 
		 * A - C Running Time : 8692
		 * 
		 * A - D Running Time : 8297
		 * 
		 * A - E Running Time : 10667
		 * 
		 * A - F Running Time : 6716
		 * 
		 * A - G Running Time : 14222
		 * 
		 * A - H Running Time : 11852
		 * 
		 * A - I Running Time : 25679
		 * 
		 * B - A Running Time : 6321
		 * 
		 * B - B Running Time : 11062
		 * 
		 * B - C Running Time : 5925
		 * 
		 * B - D Running Time : 11457
		 * 
		 * B - E Running Time : 13432
		 * 
		 * B - F Running Time : 6716
		 * 
		 * B - G Running Time : 15013
		 * 
		 * B - H Running Time : 11852
		 * 
		 * B - I Running Time : 24493
		 * 
		 * C - A Running Time : 5926
		 * 
		 * C - B Running Time : 5926
		 * 
		 * C - C Running Time : 9086
		 * 
		 * C - D Running Time : 6716
		 * 
		 * C - E Running Time : 28444
		 * 
		 * C - F Running Time : 27259
		 * 
		 * C - G Running Time : 13432
		 * 
		 * C - H Running Time : 14222
		 * 
		 * C - I Running Time : 24098
		 * 
		 * D - A Running Time : 7507
		 * 
		 * D - B Running Time : 7901
		 * 
		 * D - C Running Time : 6321
		 * 
		 * D - D Running Time : 10272
		 * 
		 * D - E Running Time : 11457
		 * 
		 * D - F Running Time : 7111
		 * 
		 * D - G Running Time : 14222
		 * 
		 * D - H Running Time : 11851
		 * 
		 * D - I Running Time : 25284
		 * 
		 * E - A Running Time : 9877
		 * 
		 * E - B Running Time : 18963
		 * 
		 * E - C Running Time : 9481
		 * 
		 * E - D Running Time : 10667
		 * 
		 * E - E Running Time : 17383
		 * 
		 * E - F Running Time : 9877
		 * 
		 * E - G Running Time : 16198
		 * 
		 * E - H Running Time : 13037
		 * 
		 * E - I Running Time : 25679
		 * 
		 * F - A Running Time : 6321
		 * 
		 * F - B Running Time : 6716
		 * 
		 * F - C Running Time : 27260
		 * 
		 * F - D Running Time : 21333
		 * 
		 * F - E Running Time : 10271
		 * 
		 * F - F Running Time : 11457
		 * 
		 * F - G Running Time : 13827
		 * 
		 * F - H Running Time : 14222
		 * 
		 * F - I Running Time : 27259
		 * 
		 * G - A Running Time : 13037
		 * 
		 * G - B Running Time : 14618
		 * 
		 * G - C Running Time : 13037
		 * 
		 * G - D Running Time : 14222
		 * 
		 * G - E Running Time : 16197
		 * 
		 * G - F Running Time : 13432
		 * 
		 * G - G Running Time : 27655
		 * 
		 * G - H Running Time : 15408
		 * 
		 * G - I Running Time : 29630
		 * 
		 * H - A Running Time : 11456
		 * 
		 * H - B Running Time : 11852
		 * 
		 * H - C Running Time : 13037
		 * 
		 * H - D Running Time : 12247
		 * 
		 * H - E Running Time : 12641
		 * 
		 * H - F Running Time : 14222
		 * 
		 * H - G Running Time : 35555
		 * 
		 * H - H Running Time : 52939
		 * 
		 * H - I Running Time : 26469
		 * 
		 * I - A Running Time : 23309
		 * 
		 * I - B Running Time : 24099
		 * 
		 * I - C Running Time : 24098
		 * 
		 * I - D Running Time : 24494
		 * 
		 * I - E Running Time : 38716
		 * 
		 * I - F Running Time : 24889
		 * 
		 * I - G Running Time : 28444
		 * 
		 * I - H Running Time : 27259
		 * 
		 * I - I Running Time : 57679
		 * 
		 * 
		 * 
		 * 
		 * Multiplication Running Time
		 * 
		 * 
		 * A * A Running Time : 404543
		 * 
		 * A * B Running Time : 10667
		 * 
		 * A * C Running Time : 7507
		 * 
		 * A * D Running Time : 8692
		 * 
		 * A * E Running Time : 13432
		 * 
		 * A * F Running Time : 8691
		 * 
		 * A * G Running Time : 20148
		 * 
		 * A * H Running Time : 18568
		 * 
		 * A * I Running Time : 43062
		 * 
		 * B * A Running Time : 5530
		 * 
		 * B * B Running Time : 9481
		 * 
		 * B * C Running Time : 8691
		 * 
		 * B * D Running Time : 10667
		 * 
		 * B * E Running Time : 18173
		 * 
		 * B * F Running Time : 11852
		 * 
		 * B * G Running Time : 29630
		 * 
		 * B * H Running Time : 51753
		 * 
		 * B * I Running Time : 64395
		 * 
		 * C * A Running Time : 5926
		 * 
		 * C * B Running Time : 7901
		 * 
		 * C * C Running Time : 9877
		 * 
		 * C * D Running Time : 13827
		 * 
		 * C * E Running Time : 45828
		 * 
		 * C * F Running Time : 14618
		 * 
		 * C * G Running Time : 54123
		 * 
		 * C * H Running Time : 57679
		 * 
		 * C * I Running Time : 85729
		 * 
		 * D * A Running Time : 7506
		 * 
		 * D * B Running Time : 48593
		 * 
		 * D * C Running Time : 12642
		 * 
		 * D * D Running Time : 38321
		 * 
		 * D * E Running Time : 34370
		 * 
		 * D * F Running Time : 37926
		 * 
		 * D * G Running Time : 68346
		 * 
		 * D * H Running Time : 49778
		 * 
		 * D * I Running Time : 127209
		 * 
		 * E * A Running Time : 12642
		 * 
		 * E * B Running Time : 17778
		 * 
		 * E * C Running Time : 22124
		 * 
		 * E * D Running Time : 31605
		 * 
		 * E * E Running Time : 65185
		 * 
		 * E * F Running Time : 35556
		 * 
		 * E * G Running Time : 108641
		 * 
		 * E * H Running Time : 171457
		 * 
		 * E * I Running Time : 282469
		 * 
		 * F * A Running Time : 9086
		 * 
		 * F * B Running Time : 11852
		 * 
		 * F * C Running Time : 14222
		 * 
		 * F * D Running Time : 21333
		 * 
		 * F * E Running Time : 36741
		 * 
		 * F * F Running Time : 21729
		 * 
		 * F * G Running Time : 64790
		 * 
		 * F * H Running Time : 55309
		 * 
		 * F * I Running Time : 210173
		 * 
		 * G * A Running Time : 19358
		 * 
		 * G * B Running Time : 28839
		 * 
		 * G * C Running Time : 35951
		 * 
		 * G * D Running Time : 58864
		 * 
		 * G * E Running Time : 106666
		 * 
		 * G * F Running Time : 97185
		 * 
		 * G * G Running Time : 220839
		 * 
		 * G * H Running Time : 255604
		 * 
		 * G * I Running Time : 491456
		 * 
		 * H * A Running Time : 38321
		 * 
		 * H * B Running Time : 28445
		 * 
		 * H * C Running Time : 35950
		 * 
		 * H * D Running Time : 92049
		 * 
		 * H * E Running Time : 151308
		 * 
		 * H * F Running Time : 92049
		 * 
		 * H * G Running Time : 232691
		 * 
		 * H * H Running Time : 195555
		 * 
		 * H * I Running Time : 587455
		 * 
		 * I * A Running Time : 66370
		 * 
		 * I * B Running Time : 82173
		 * 
		 * I * C Running Time : 95209
		 * 
		 * I * D Running Time : 195556
		 * 
		 * I * E Running Time : 368592
		 * 
		 * I * F Running Time : 140247
		 * 
		 * I * G Running Time : 377678
		 * 
		 * I * H Running Time : 265876
		 * 
		 * I * I Running Time : 662122
		 * 
		 * 
		 * 
		 * 
		 * Power Running Time
		 * 
		 * A's 5th power Running Time : 324345 A's 10th power Running Time :
		 * 26864 A's 20th power Running Time : 119704 A's 30th power Running
		 * Time : 125630
		 * 
		 * B's 5th power Running Time : 28049 B's 10th power Running Time :
		 * 68346 B's 20th power Running Time : 225185 B's 30th power Running
		 * Time : 612345
		 * 
		 * C's 5th power Running Time : 48197 C's 10th power Running Time :
		 * 162370 C's 20th power Running Time : 560196 C's 30th power Running
		 * Time : 1620936
		 * 
		 * D's 5th power Running Time : 150519 D's 10th power Running Time :
		 * 304197 D's 20th power Running Time : 1130665 D's 30th power Running
		 * Time : 2111997
		 * 
		 * E's 5th power Running Time : 282074 E's 10th power Running Time :
		 * 646320 E's 20th power Running Time : 1993083 E's 30th power Running
		 * Time : 4843054
		 * 
		 * F's 5th power Running Time : 98370 F's 10th power Running Time :
		 * 230716 F's 20th power Running Time : 616295 F's 30th power Running
		 * Time : 1521380
		 * 
		 * G's 5th power Running Time : 640789 G's 10th power Running Time :
		 * 2949131 G's 20th power Running Time : 8300234 G's 30th power Running
		 * Time : 1218763
		 * 
		 * H's 5th power Running Time : 38716 H's 10th power Running Time :
		 * 103506 H's 20th power Running Time : 425876 H's 30th power Running
		 * Time : 955653
		 * 
		 * I's 5th power Running Time : 252840 I's 10th power Running Time :
		 * 766024 I's 20th power Running Time : 3222514 I's 30th power Running
		 * Time : 8023296
		 * 
		 * 
		 * 
		 * New Link List Running Time
		 * 
		 * J Running time is: 434567 K Running time is: 69926 L Running time is:
		 * 606024 M Running time is: 459456 N Running time is: 105481 O Running
		 * time is: 98370 P Running time is: 69136 Q Running time is: 67160 R
		 * Running time is: 568098 S Running time is: 165926 T Running time is:
		 * 83358 U Running time is: 94420 V Running time is: 63605 W Running
		 * time is: 105481 X Running time is: 703209 Y Running time is: 92049 Z
		 * Running time is: 889282
		 * 
		 * 
		 * 
		 */

		Long starttime1 = System.nanoTime();
		;
		Long starttime3;
		Long starttime2;

		LongInteger A = new LongInteger("2222");
		starttime1 = System.nanoTime();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("A's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger B = new LongInteger("99999999");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("B's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger C = new LongInteger("-246813575732");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("C's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger D = new LongInteger("180270361023456789");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("D's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger E = new LongInteger("1423550000000010056810000054593452907711568359");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("E's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger F = new LongInteger("-350003274594847454317890");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("F's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger G = new LongInteger(
				"29302390234702973402973420937420973420937420937234872349872934872893472893749287423847");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("G's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger H = new LongInteger(
				"-98534342983742987342987339234098230498203894209928374662342342342356723423423");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("H's Initialization Runnig Time : " +starttime2);

		starttime1 = System.nanoTime();
		LongInteger I = new LongInteger(
				"8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612");
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("I's Initialization Runnig Time : " +starttime2);

		LongInteger[] comp = new LongInteger[9];
		comp[0] = A;
		comp[1] = B;
		comp[2] = C;
		comp[3] = D;
		comp[4] = E;
		comp[5] = F;
		comp[6] = G;
		comp[7] = H;
		comp[8] = I;

		char[] comp_name = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

		System.out.println(
				"\n---------------------------------------------------The Original Strings-----------------------------------------------------------\n");
		starttime3 = System.nanoTime();
		for (int i = 0; i < comp.length; i++) {
			starttime1 = System.nanoTime();
			System.out.print("\n\nOriginal String " + comp_name[i] + " : ");
			comp[i].output();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.println("\n"+comp_name[i]+"'s output running time is :
			// " +starttime2 );

		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal String Running time is: " + starttime2);

		System.out.println("\n\n");
		System.out.println(
				"\n---------------------------------------------------The Link Lists-----------------------------------------------------------\n");
		starttime3 = System.nanoTime();
		for (int i = 0; i < comp.length; i++) {

			starttime1 = System.nanoTime();
			System.out.print("\nElements in List " + comp_name[i] + " : ");
			comp[i].traverse();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.println("\n"+comp_name[i]+"'s traverse running time is
			// : " +starttime2 );
			System.out.println();

		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Link Lists Running time is: " + starttime2);

		System.out.println("\n\n");
		System.out.println(
				"\n---------------------------------------------------Digit Count-----------------------------------------------------------\n");
		starttime3 = System.nanoTime();
		for (int i = 0; i < comp.length; i++) {
			starttime1 = System.nanoTime();
			System.out.println("\nNumber of Digits in " + comp_name[i] + " : " + comp[i].getDigitCount());
			starttime2 = System.nanoTime() - starttime1;
			// System.out.println(""+comp_name[i]+"'s digit count running time
			// is : " +starttime2 );
			System.out.println();

		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Digit Count Running time is: " + starttime2);

		System.out.println("\n\n");
		System.out.println(
				"\n---------------------------------------------------Utilities Operations-----------------------------------------------------------\n");

		starttime1 = System.nanoTime();
		int A1 = 2222;
		int B1 = 99999999;
		System.out.println("\nOverflow in A is: " + UtilityOperations.overflow(A1));
		System.out.println("Underflow in A is: " + UtilityOperations.underflow(A1));
		System.out.println("Digits in A is: " + UtilityOperations.digits(A1));
		System.out.println("\nOverflow in B is: " + UtilityOperations.overflow(B1));
		System.out.println("Underflow in B is: " + UtilityOperations.underflow(B1));
		System.out.println("Digits in B is: " + UtilityOperations.digits(B1));
		System.out.println();
		starttime2 = System.nanoTime() - starttime1;
		System.out.println("\n\nThe Utilities Operations Running time is: " + starttime2);

		System.out.println("\n\n");
		System.out.println(
				"\n---------------------------------------------------Comparisons(<,>,=)-----------------------------------------------------------\n");

		starttime3 = System.nanoTime();
		for (int i = 0; i < comp.length; i++) {
			for (int j = 0; j < comp.length; j++) {
				System.out.println("Comparisons of List " + comp_name[i] + " starts from here: ");

				starttime1 = System.nanoTime();
				System.out.println("" + comp_name[i] + "=" + comp_name[j] + " : " + comp[i].equalTo(comp[j]));
				// comp[i].equalTo(comp[j]);
				starttime2 = System.nanoTime() - starttime1;
				// System.out.println(" "+comp_name[i] +"=" +comp_name[j] +"
				// Running Time : " +starttime2 );

				starttime1 = System.nanoTime();
				System.out.println("" + comp_name[i] + "<" + comp_name[j] + " : " + comp[i].lessThan(comp[j]));
				// comp[i].lessThan(comp[j]);
				starttime2 = System.nanoTime() - starttime1;
				// System.out.println(" "+comp_name[i] +"<" +comp_name[j] +"
				// Running Time : " +starttime2 );

				starttime1 = System.nanoTime();
				System.out.println("" + comp_name[i] + ">" + comp_name[j] + " : " + comp[i].greaterThan(comp[j]));
				// comp[i].greaterThan(comp[j]);
				starttime2 = System.nanoTime() - starttime1;
				// System.out.println(" "+comp_name[i] +">" +comp_name[j] +"
				// Running Time : " +starttime2 );
				System.out.println();
			}
		}

		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Camparisons(<,>,=) Running time is: " + starttime2);

		System.out.println(
				"\n\n--------------------------------------------------ADDITION-----------------------------------------------------------\n");
		starttime3 = System.nanoTime();
		for (int j = 0; j < comp.length; j++) {
			for (int i = 0; i < comp.length; i++) {
				starttime1 = System.nanoTime();
				System.out.print("\n\nThis is: " + comp_name[j] + " + " + comp_name[i] + " : ");
				comp[j].add(comp[i]).output();
				starttime2 = System.nanoTime() - starttime1;
				// System.out.print("\n * "+comp_name[j] +" + " +comp_name[i] +"
				// Running Time : "+starttime2);
				System.out.println();

			}
		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Addition Running time is: " + starttime2);

		starttime3 = System.nanoTime();
		System.out.println(
				"\n---------------------------------------------------SUBTRACTION-----------------------------------------------------------\n");
		for (int j = 0; j < comp.length; j++) {
			for (int i = 0; i < comp.length; i++) {

				starttime1 = System.nanoTime();
				System.out.print("\n\nThis is: " + comp_name[j] + " - " + comp_name[i] + " : ");
				comp[j].subtract(comp[i]).output();
				starttime2 = System.nanoTime() - starttime1;
				// System.out.print("\n * "+comp_name[j] +" - " +comp_name[i] +"
				// Running Time : "+starttime2);
				System.out.println();

			}
		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Subtraction Running time is: " + starttime2);

		starttime3 = System.nanoTime();
		System.out.println(
				"\n----------------------------------------------------MULTIPLICATION----------------------------------------------------------\n");
		for (int j = 0; j < comp.length; j++) {
			for (int i = 0; i < comp.length; i++) {

				starttime1 = System.nanoTime();
				System.out.print("\n\nThis is: " + comp_name[j] + " * " + comp_name[i] + " : ");
				comp[j].multiply(comp[i]).output();
				starttime2 = System.nanoTime() - starttime1;
				// System.out.print("\n * "+comp_name[j] +" * " +comp_name[i] +"
				// Running Time : "+starttime2);
				System.out.println();

			}
		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Multiplication Running time is: " + starttime2);

		starttime3 = System.nanoTime();
		System.out.println(
				"\n-------------------------------------------------------POWER-----------------------------------------------------------------\n");

		for (int i = 0; i < comp.length; i++) {
			starttime1 = System.nanoTime();
			System.out.print("\n\n\n\n" + comp_name[i] + " to the 5th power: ");
			comp[i].power(5).output();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.print("\n * "+comp_name[i] +"'s 5th power Running Time
			// : "+starttime2);

			starttime1 = System.nanoTime();
			System.out.print("\n\n" + comp_name[i] + " to the 10th power: ");
			comp[i].power(10).output();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.print("\n * "+comp_name[i] +"'s 10th power Running
			// Time : "+starttime2);

			starttime1 = System.nanoTime();
			System.out.print("\n\n" + comp_name[i] + " to the 20th power: ");
			comp[i].power(20).output();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.print("\n * "+comp_name[i] +"'s 20th power Running
			// Time : "+starttime2);

			starttime1 = System.nanoTime();
			System.out.print("\n\n" + comp_name[i] + " to the 30th power: ");
			comp[i].power(30).output();
			starttime2 = System.nanoTime() - starttime1;
			// System.out.print("\n * "+comp_name[i] +"'s 30th power Running
			// Time : "+starttime2);

			System.out.println();

		}
		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\nTotal Power Running time is: " + starttime2);

		starttime3 = System.nanoTime();
		starttime1 = System.nanoTime();
		System.out.println(
				"\n-------------------------------------------------------NEW LINK LIST----------------------------------------------------------\n");

		LongInteger J = B.add(C);
		System.out.print("This is Link List J:");
		J.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nJ Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger K = C.add(D);
		System.out.print("\nThis is Link List K:");
		K.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nK Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger L = I.add(I);
		System.out.print("\nThis is Link List L:");
		L.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nL Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger M = A.add(I);
		System.out.print("\nThis is Link List M:");
		M.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nM Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger N = B.add(K);
		System.out.print("\nThis is Link List N:");
		N.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nN Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger O = A.subtract(D);
		System.out.print("\nThis is Link List O:");
		O.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nO Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger P = C.subtract(D);
		System.out.print("\nThis is Link List P:");
		P.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nP Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger Q = D.subtract(C);
		System.out.print("\nThis is Link List Q:");
		Q.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nQ Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger R = L.subtract(L);
		System.out.print("\nThis is Link List R:");
		R.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nR Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger S = P.subtract(O);
		System.out.print("\nThis is Link List S:");
		S.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nS Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger T = N.subtract(Q);
		System.out.print("\nThis is Link List T:");
		T.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nT Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger U = A.multiply(D);
		System.out.print("\nThis is Link List U:");
		U.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nU Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger V = B.multiply(C);
		System.out.print("\nThis is Link List V:");
		V.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nV Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger W = D.multiply(D);
		System.out.print("\nThis is Link List W:");
		W.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nW Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger X = O.multiply(I);
		System.out.print("\nThis is Link List X:");
		X.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nX Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger Y = J.multiply(P);
		System.out.print("\nThis is Link List Y:");
		Y.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nY Running time is: " +starttime2 );

		starttime1 = System.nanoTime();
		LongInteger Z = M.multiply(N);
		System.out.print("\nThis is Link List Z:");
		Z.output();
		starttime2 = System.nanoTime() - starttime1;
		// System.out.println("\nZ Running time is: " +starttime2 );

		starttime2 = System.nanoTime() - starttime3;
		System.out.println("\n\n\nTotal New Link List Running Time:" + starttime2);

	}
}
