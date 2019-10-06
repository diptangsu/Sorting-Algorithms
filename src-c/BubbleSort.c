#include <stdio.h>
void bubblesort(int tamanho, int lista[]) {
    int i = 0, k, aux;
    for (i = 0; i < (tamanho - 1); i++) {
        for (k = (i + 1); k < tamanho; k++) {
            if (lista[i] > lista[k]) {
                aux = lista[i];
                lista[i] = lista[k];
                lista[k] = aux;
            }
        }
    }
}

int main() {
    int N, i = 0, j = 0;
    scanf("%d", &N);
    int T[N];
    for (j = 0; j < N; j++) {
        scanf("%d", &T[j]);
    }
    bubblesort(N, T);
    for (i = 0; i < N; i++) {
        printf("%d ", T[i]);
    }
    printf("\n");
    return 0;
}