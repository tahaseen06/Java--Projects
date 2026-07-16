public string secondWordUpperCase(string input1)
{
    input1 = input1.Trim();

    string[] words = input1.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

    if (words.Length < 2)
    {
        return "LESS";
    }

    return words[1].ToUpper();
}