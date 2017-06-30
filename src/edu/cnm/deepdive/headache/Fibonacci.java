/**
 * 
 */
package edu.cnm.deepdive.headache;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * Implements a non-recursive {@link java.lang.Iterable} version of the Fibonacci sequence
 * 
 * @author natedaag
 */
public class Fibonacci implements Iterable<BigInteger> {

  public static final long LIMIT = 10_000_000_000L;

  /**
   * Tests Fibonacci sequence iterable in an enhanced for loop.
   * 
   * @param args command line arguments ignored for now.
   */
  public static void main(String[] args) {
    BigInteger limit = BigInteger.valueOf(10_000_000_000L);
    Fibonacci fib = new Fibonacci();
    for (BigInteger current : fib) {
      if (current.compareTo(limit) > 0) {
        break;
      }
      System.out.printf("%,d%n", current);
    }
  }

  @Override
  public Iterator<BigInteger> iterator() {
    return new Iter();
  }

  private class Iter implements Iterator<BigInteger> {

    private BigInteger current = BigInteger.ONE;
    private BigInteger previous = BigInteger.valueOf(-1);

    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return true;
    }

    @Override
    public BigInteger next() {
      BigInteger next = current.add(previous);
      previous = current;
      current = next;


      return next;
    }

  }

}


