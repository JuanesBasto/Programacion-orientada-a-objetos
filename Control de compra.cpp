#include <stdio.h>
#include <stdlib.h>

int main() {
    int prenda, cantp = 0, cantc = 0, cantz = 0, total = 0, num_personas = 0;
    char opcion;
nuevo:
	prenda=0;
    while (prenda != 4) {
        printf("Cliente %d, que prenda deseas comprar:\n", num_personas + 1);
        printf("1. Pantalones $96.000\n");
        printf("2. Camisas $32.000\n");
        printf("3. Zapatos $60.000\n");
        printf("Pulse 4 para terminar la compra.\n");

        scanf(" %d", &prenda);

        switch (prenda) {
            case 1: 
                cantp++;
                total += 96000;
                printf("Se agrego un pantalon\n");
                break;
            case 2:
                cantc++;
                total += 32000;
                printf("Se agrego una camisa\n");
                break;
            case 3:
                cantz++;
                total += 60000;
                printf("Se agregaron unos zapatos\n");
                break;
            case 4:
            	num_personas++;
                printf("Terminando la compra.\n");
                break;
            default:
                printf("Digite una opcion valida.\n");
                break;
        }
        
    }
	
	printf ("Desea agregar nuevo cliente?\n");
	printf ("Si : s\n");
	printf ("No : p\n");
	while(opcion!='s' && opcion!='p'){
		printf("Ingrese una opcion (s para agregar, p para salir): ");
        scanf(" %c", &opcion);
        printf("\n");
		
		if (opcion == 's') {
			goto nuevo;
        } else if (opcion == 'p') {
            printf("Saliendo del programa...\n");
        } else {
            printf("La opcion ingresada no es valida.\n");
        }	
	}

    printf("Compraron %d personas.\n", num_personas);
    printf("Se vendieron $%d en total.\n", total);
    printf("Se vendieron %d pantalones, %d camisas y %d zapatos.\n", cantp, cantc, cantz);

    return 0;
}

