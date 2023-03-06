# Iterator
Вывод четных чисел из массива <br>
<br>
<h2> Тесты <br> </h2>
<br>
<h4> shouldReturnEvenNumbersSequentially() <br></h4>
вывод четных чисел по отдельности (не массивом) и генерация NoSuchElementException в случае нечетного элемента <br>
<br>
<h4> sequentialHasNextInvocationDoesntAffectRetrievalOrder <br></h4>
Самостоятельный вызов hasNext не влияет на порядок возвращаемых значений <br>
<br>
<h4> shouldReturnFalseIfNoAnyEvenNumbers <br></h4>
Если нет четных числе hasNext возвращает false <br>
<br>
<h4> allNumbersAreEven <br></h4>
Если в массиве все четные, возвращаются все значения <br>
<br>
<h4> emptyArray </h4>
Если массив пустой, возвращает false <br>
<br>
<h4> differentNumbers <br></h4>
Если в массиве есть четные и нечетные, возвращает четные до первого нечетного числа <br>
<br>
<h4>hasNextReturnTheSameValues</h4>
Многократный вызов hasNext возвращает одно и то же значение <br>
<br>
<h4> nextOnlyReturnAllEvenValues </h4><br>
Многократный вызов next возвращает все четные значения массива по очереди до первого нечетного элемента <br>
<br>
<h4> firstNextAfterHasNextUseNextIndex </h4><br>
Вызов hasNext после next не влияет на возвращаемые значения
