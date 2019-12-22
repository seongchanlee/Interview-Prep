class MaxProfit {
  /*
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
   */

  // Brute force solution
  public int maxProfitBruteForce(int[] prices) {
    // Base case
    if (prices.length == 0) {
      return 0;
    }
    
    // If no purchase is made, the profit defaults to 0
    int finalProfit = 0;
  
    // max(prices[j]−prices[i]), for every i and j such that j > i
    // [i < prices.length - 1], because no need to check last element
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
          int currProfit = prices[j] - prices[i];
          if (currProfit > finalProfit) {
            finalProfit = currProfit;
          }
      }
    }

    return finalProfit;
  }

  // Optimal solution (one pass)
  public int maxProfitOnePass(int prices[]) {
    int minprice = Integer.MAX_VALUE;
    int maxprofit = 0;

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minprice)
            minprice = prices[i];
        else if (prices[i] - minprice > maxprofit)
            maxprofit = prices[i] - minprice;
    }
    return maxprofit;
  }
}