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
        
    elif escolha == 3:
        num1 = int(input("Digite o primeiro número da multiplicação: "))
        num2 = int(input("Digite o segundo número da multiplicação: "))
        print("Resultado: " + str(calculadora.multiplicar(num1, num2)))
        
    elif escolha == 4:
        num1 = int(input("Digite o numerador da divisão: "))
        num2 = int(input("Digite o denominador da divisão: "))
        print("Resultado: " + str(calculadora.dividir(num1, num2)))
menu()