package Ch_4_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by HuGuodong on 1/29/20.
 */
public class _DepthFirstPathsClient {

  public static void main(String[] args) {
    _AdjListGraph G = new _AdjListGraph(new In("algdata/tinyCG.txt"));
    int s = 0;
    _DepthFirstPaths paths = new _DepthFirstPaths(G, s);
    for (int v = 0; v < G.V(); v++) {
      StdOut.print(s + " to " + v + ": ");
      if (paths.hashPathTo(v)) {
        for (int x : paths.pathTo(v)) {
          if (x == s) {
            StdOut.print(x);
          } else {
            StdOut.print("-" + x);
          }
        }
        StdOut.println();
      }
    }
  }
}
