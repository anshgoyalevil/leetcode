<h2><a href="https://leetcode.com/problems/destination-city/">1436. Destination City</a></h2><h3>Easy</h3><hr><div class=""><p class="">You are given the array <code class="">paths</code>, where <code class="">paths[i] = [cityA<sub class="">i</sub>, cityB<sub class="">i</sub>]</code> means there exists a direct path going from <code class="">cityA<sub class="">i</sub></code> to <code class="">cityB<sub class="">i</sub></code>. <em class="">Return the destination city, that is, the city without any path outgoing to another city.</em></p>

<p class="">It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.</p>

<p class="">&nbsp;</p>
<p class=""><strong class="">Example 1:</strong></p>

<pre class=""><strong class="">Input:</strong> paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
<strong class="">Output:</strong> "Sao Paulo" 
<strong class="">Explanation:</strong> Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -&gt; "New York" -&gt; "Lima" -&gt; "Sao Paulo".
</pre>

<p class=""><strong class="">Example 2:</strong></p>

<pre class=""><strong class="">Input:</strong> paths = [["B","C"],["D","B"],["C","A"]]
<strong class="">Output:</strong> "A"
<strong class="">Explanation:</strong> All possible trips are:&nbsp;
"D" -&gt; "B" -&gt; "C" -&gt; "A".&nbsp;
"B" -&gt; "C" -&gt; "A".&nbsp;
"C" -&gt; "A".&nbsp;
"A".&nbsp;
Clearly the destination city is "A".
</pre>

<p class=""><strong class="">Example 3:</strong></p>

<pre class=""><strong class="">Input:</strong> paths = [["A","Z"]]
<strong class="">Output:</strong> "Z"
</pre>

<p class="">&nbsp;</p>
<p class=""><strong class="">Constraints:</strong></p>

<ul class="">
	<li class=""><code class="">1 &lt;= paths.length &lt;= 100</code></li>
	<li class=""><code class="">paths[i].length == 2</code></li>
	<li class=""><code class="">1 &lt;= cityA<sub class="">i</sub>.length, cityB<sub class="">i</sub>.length &lt;= 10</code></li>
	<li class=""><code class="">cityA<sub class="">i</sub> != cityB<sub class="">i</sub></code></li>
	<li class="">All strings consist of lowercase and uppercase English letters and the space character.</li>
</ul>
</div>