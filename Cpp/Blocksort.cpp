#include <vector>
#include <iostream>
#include <algorithm>

class Blocksort
{
public:
	static std::string encode(const std::string &input,int &top);
	static std::string decode(const std::string &input,int top);
};


std::string Blocksort::encode(const std::string &input, int &top)
{
	std::string buff,result;
	buff = input + input;
	std::vector<std::string> vectemp;
  
	for(int i=0; i < buff.size()/2;++i){
		std::string temp=buff.substr(i,input.size());	
		vectemp.push_back(temp);
	}

	std::stable_sort(vectemp.begin(),vectemp.end());

	for(int i=0; i < vectemp.size();++i){
		if( input == vectemp[i] ) top = i;
		result += *(vectemp[i].end()-1);
	}
	return result;
}

std::string Blocksort::decode(const std::string &input,int top)
{
	std::string result,inputs=input;
	std::vector<int> idx(input.size());
  for (int i = 0; i != idx.size(); ++i) idx[i] = i;
	std::stable_sort(idx.begin(),idx.end(),
			[inputs](int i1,int i2)	{return inputs[i1] < inputs[i2];});

	int p = top;
	for(int i=0;i<input.size();++i) {
		p = idx[p];
		result += inputs[p];
	}

	return result;
}
