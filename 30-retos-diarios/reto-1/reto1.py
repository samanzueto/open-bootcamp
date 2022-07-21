import pandas as pd

def main():
    f = pd.read_excel('sample.xlsx', sheet_name='Hoja1', usecols="B")
    print(f.drop_duplicates(subset="Correo"))

if __name__ == '__main__':
    main()