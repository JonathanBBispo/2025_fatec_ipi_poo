import calculadora
def menu():
    print("\nEscolha uma opção abaixo:")
    print("1. Somar")
    print("2. Subtrair")
    print("3. Multiplicar")
    print("4. Dividir")
    print("0. Sair")
    escolha = int(input(""))
        
    if escolha == 1:
        num1 = int(input("Insira o primeiro número da soma: "))
        num2 = int(input("Insira o segundo número da soma: "))
        print("Resultado: " + str(calculadora.somar(num1, num2)))
            
    elif escolha == 2:
        num1 = int(input("Insira o primeiro número da subtração: "))
        num2 = int(input("Insira o segundo número da soma: "))
        print("Resultado: " + str(calculadora.subtrair(num1, num2)))              
menu()