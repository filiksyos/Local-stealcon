import os

def summarize_file(file_path):
    """Summarize the content of a file by extracting the first few lines."""
    summary_lines = []
    with open(file_path, 'r') as file:
        # Read first 10 lines or less
        for i, line in enumerate(file):
            if i >= 10:
                break;
            summary_lines.append(line.strip())
    return summary_lines

def write_summary(output_path, summaries):
    """Write the summaries to a .txt file."""
    with open(output_path, 'w') as f:
        f.write("Summary of selected files:\n")
        for file_name, lines in summaries.items():
            f.write(f"\n--- {file_name} ---\n")
            for line in lines:
                f.write(line + '\n')
            f.write('\n')

if __name__ == "__main__":
    # Define files to summarize
    files_to_summarize = ['addvictimdialog', 'addworddialog']

    summaries = {}
    for file in files_to_summarize:
        if os.path.exists(file):
            summaries[file] = summarize_file(file)
        else:
            summaries[file] = ["File not found."]

    # Output summary to summary.txt
    write_summary('summary.txt', summaries)
