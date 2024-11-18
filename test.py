import fp_growth_py3 as fpg
dataset = [
    ['I1', 'I2', 'I5'],
    ['I2','I4'],
    ['I2','I3'],
    ['I1','I2','I4'],
    ['I1','I3'],
    ['I2','I3'],
    ['I1','I3'],
    ['I1','I3'],
    ['I1','I2','I3','I5'],
    ['I1','I2','I3']
]

if __name__ == '__main__':

    
    frequent_itemsets = fpg.find_frequent_itemsets(dataset, minimum_support=2, include_support=True)
    print(type(frequent_itemsets))   

    result = []
    for itemset, support in frequent_itemsets:    
        result.append((itemset, support))

    result = sorted(result, key=lambda i: i[0])  
    for itemset, support in result:
        print(str(itemset) + ' ' + str(support))
