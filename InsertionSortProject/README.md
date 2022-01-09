# InsertionSortProject
Insertion Sort Bölüm Sonu Projesi

[22,27,16,2,18,6]

```
 1-)Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
 2-)Big-O gösterimini yazınız.
 3-)Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
 4-)Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
``` 


'1)'

        1- [22,27,16,2,18,6] --> n

        2- [16,22,27,2,18,6] --> n-1

        3- [2,16,22,27,18,6] --> n-2

        4- [2,16,18,22,27,6] --> n-3

        4- [2,6,16,18,22,27] --> n-4



'2,3)'

        Best Case = O(n)
        Average Case = O(n^2)
        Worst Case = O(n^2)


'4)'

        18 Sayısı Average Case Kapsamına girmektedir.



```[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort a göre ilk 4 adımını yazınız.```


        1- [3,7,5,8,2,9,4,15,6]

        2- [3,5,7,8,2,9,4,15,6]

        3- [3,5,7,8,2,9,4,15,6]

        4- [2,3,5,7,8,9,4,15,6]