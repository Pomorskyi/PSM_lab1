# PSM_lab1

Zaimplementować funkcję sin(x) liczącą wartość funkcji sin wykorzystując rozwinięcie w szereg Taylora zgodnie z formułą: 
## sin(x) = x - x^3/3! + x^5/5! - x^7/7! + x^9/9! - x^11/11! + x^13/13! - x^15/15! + x^17/17! - x^19/19! + x^21/21!
Wykonać obliczenia biorąc pod uwagę kolejno 1,2,3,..,10 wyrazy szeregu
Kolejne wyniki porównać do wyniku funkcji sin z biblioteki matematycznej oraz wyświetlić bezwzględną wartość różnicy pomiędzy tymi wynikami.
Program powinien policzyć wartość funkcjidla dowolnego kąta x wyrażonego w stopniach lub radianach
Przybliżenie działa poprawnie w pierwszej ćwiartce, kąt należy najpierw sprowadzić do przedziału 0..2π, następnie:
Jeśli:  𝑥∈0..𝜋2: 𝑥 → 𝑥;
        𝑥∈𝜋2..𝜋: 𝑥 → 𝜋 − 𝑥;
        𝑥∈𝜋..3/2*𝜋∶ 𝑥 → 𝑥 − 𝜋;
        𝑥∈3/2*𝜋..2𝜋∶ 𝑥 → 2 * 𝜋 − 𝑥;
